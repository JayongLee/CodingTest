import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int l = 0; l < commands.length; l++) {
            int i = commands[l][0];
            int j = commands[l][1];
            int k = commands[l][2];

            int[] new_array = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(new_array);
            ans.add(new_array[k-1]);
        }
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}