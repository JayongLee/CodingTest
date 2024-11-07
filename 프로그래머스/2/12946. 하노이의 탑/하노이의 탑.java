import java.util.*;

class Solution {

    public int[][] solution(int n) {
        List<int[]> move_history = new ArrayList();
        hanoi(move_history, n, 1, 2, 3);
        int[][] answer = move_history.toArray(new int[move_history.size()][]);
        return answer;
    }
    
    public void hanoi(List<int[]> move_history, int n, int from, int temp, int to) {
        if (n == 1) {
            move_history.add(new int[] {from, to});
            return;
        }
        
        hanoi(move_history, n-1, from, to, temp);
        move_history.add(new int[] {from, to});
        hanoi(move_history, n-1, temp, from, to);
    }
}