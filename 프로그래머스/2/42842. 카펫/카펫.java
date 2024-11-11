class Solution {
    public int[] solution(int brown, int yellow) {

        int total = brown + yellow;

        for (int i = 2; i < brown / 2; i++) {
            if (total % i == 0) {
                int j = total / i;
                if ((i - 2) * (j - 2) == yellow) {
                    if (i >= j) {
                        return new int[] {i, j};
                    } else {
                        return new int[] {j, i};
                    }
                }
            } else {
                continue;
            }
        }
        int[] answer = {};
        return answer;
    }
}