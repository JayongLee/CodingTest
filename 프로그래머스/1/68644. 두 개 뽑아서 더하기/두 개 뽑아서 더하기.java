import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }

        Integer[] ans = result.toArray(new Integer[0]);
        int[] answer = new int[ans.length];
        for (int i = 0; i < ans.length; i++) {
             answer[i] = ans[i];
        }
        Arrays.sort(answer);
        return answer;
    }
}