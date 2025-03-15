import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> ans = new ArrayList<>();
        for (int a : arr) {
            if (a % divisor == 0) {
                ans.add(a);
            }
        }
        
        if (ans.isEmpty()) {
            ans.add(-1);
        }

        int[] answer = ans.stream().mapToInt(i -> i).toArray();ans.toArray();
        Arrays.sort(answer);
        return answer;
    }
}