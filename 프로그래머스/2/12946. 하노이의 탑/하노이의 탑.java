import java.util.*;

class Solution {

    public int[][] solution(int n) {
        List<int[]> move = new ArrayList<>();
        hanoi(move, n, 1, 2,3);
        int[][] answer = move.toArray(new int[move.size()][]);
        return answer;
    }

    public void hanoi (List<int[]> move ,int n, int from, int temp, int to){
        if (n == 1) {
            move.add(new int[]{from, to});
            return;
        }

        hanoi(move ,n-1, from, to, temp); // n-1개를 임시로 옮김 (목적지가 아닌곳)
        move.add(new int[]{from, to}); // 가장 큰 원판을 목표로
        hanoi(move,n-1, temp, from, to); // 임시로 옮긴걸 다시 목표로
    }

}