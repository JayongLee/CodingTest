class Solution {
    public int solution(String word) {
        String vowels = "AEIOU";
        int[] weights = {781, 156, 31, 6, 1};  // 5^4 + 5^3 + 5^2 + 5^1 + 5^0 = 781
        int answer = 0;
        
        for (int i = 0; i < word.length(); i++) {
            answer += vowels.indexOf(word.charAt(i)) * weights[i] + 1;
        }
        
        return answer;
    }
}