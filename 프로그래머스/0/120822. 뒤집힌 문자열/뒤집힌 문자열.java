class Solution {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            answer += chars[my_string.length() - 1 - i];
        }
        return answer;
    }
}