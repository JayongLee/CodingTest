import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] clone = array.clone();
            Arrays.sort(clone, commands[i][0] - 1, commands[i][1]);
            answer[i] = clone[(commands[i][0] - 1) + (commands[i][2] - 1)];
        }
        return answer;
    }
}