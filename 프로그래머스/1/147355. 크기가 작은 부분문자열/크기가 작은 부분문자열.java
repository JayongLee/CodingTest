class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int p_len = p.length();

        for(int i = 0; i <= t.length() - p_len; i++) {
            String t_sub = t.substring(i, i + p_len);
            if (t_sub.compareTo(p) <= 0) {
                answer += 1;
            }
        }

        return answer;
    }
}