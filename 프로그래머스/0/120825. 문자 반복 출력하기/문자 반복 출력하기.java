class Solution {
    public String solution(String my_string, int n) {
        char[] chars = my_string.toCharArray();
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += chars[i];
            }
        }
        return answer;
    }
}