import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int l = 0; l < commands.length; l++){
            int i = commands[l][0] - 1; // from
            int j = commands[l][1];  // to
            int k = commands[l][2]; // index
            int[] sort = Arrays.copyOfRange(array, i, j);
            Arrays.sort(sort);
            arr.add(sort[k-1]);
        }

        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}