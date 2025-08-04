import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> poketmon = new HashSet<>();
        for (int num : nums) {
            poketmon.add(num);
        }
        int answer = 0;

        if (poketmon.size() >= nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = poketmon.size();
        }
        return answer;
    }
}