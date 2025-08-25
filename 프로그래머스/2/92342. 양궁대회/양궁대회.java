class Solution {

    private static int diff = 0;
    private static int N;
    private static int[] apeach;
    private static int[] ans;

    public int[] solution(int n, int[] info) {
        N = n;
        apeach = info;
        backtrack(n, new int[apeach.length], 0);
        if (ans == null) {
            return new int[]{-1};
        }
        return ans;
    }

    private static void backtrack(int arrow, int[] rion, int idx) {
        if (idx == 10) {
            rion[10] = arrow; // 남은거 털기
            
            int nDiff = calculateDiff(apeach, rion);
            if (nDiff > diff) { // 점수 차가 더 큰 경우 업데이트
                diff = nDiff;
                ans = rion.clone();
            } else if (nDiff == diff && ans != null) {
                // 동일 점수 -> 낮은 점수를 더 많이 맞힌 경우
                for (int i = 10; i >= 0; i--) {
                    if (ans[i] == rion[i]) {
                        continue;
                    }
                    if (ans[i] < rion[i]) {
                        ans = rion.clone();
                        break;
                    } else break;
                }
            }
            return;
        }
        // 이기는 경우
        if (arrow > apeach[idx]) {
            int[] rionWin = rion.clone();
            rionWin[idx] = apeach[idx] + 1;
            backtrack(arrow - (apeach[idx] + 1), rionWin, idx + 1);
        }
        // 지는 경우
        int[] rionLose = rion.clone();
        backtrack(arrow, rionLose, idx + 1);
    }

    // 점수 차 계산
    private static int calculateDiff(int[] apeache, int[] rion) {
        int apeacheSum = 0;
        int rionSum = 0;
        for (int i = 0; i <= 10; i++) {
            if (apeache[i] >= rion[i] && apeache[i] != 0)
                apeacheSum += 10 - i;
            else if (rion[i] > apeache[i] && rion[i] != 0)
                rionSum += 10 - i;
        }
        return rionSum - apeacheSum;
    }
}