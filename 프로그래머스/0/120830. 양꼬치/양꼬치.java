class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        k -= service;
        return 12000 * n + 2000 * k;        
    }
}