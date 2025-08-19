class Solution {
    public int solution(int n) {
        String num = String.valueOf(n);
        int ans = 0;
        for (char c : num.toCharArray()) {
            ans += c - '0';
        }
        return ans;
    }
}