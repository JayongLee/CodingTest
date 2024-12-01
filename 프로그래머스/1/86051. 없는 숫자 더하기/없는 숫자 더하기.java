import java.util.HashSet;

class Solution {
    public int solution(int[] numbers) {

        HashSet<Integer> exist = new HashSet<>();
        for(int num : numbers) {
            exist.add(num);
        }

        int answer = 0;
        
        for(int i = 0; i < 10; i++) {
            if(!exist.contains(i)) {
                answer += i;
            }
        }
        return answer;
    }
}