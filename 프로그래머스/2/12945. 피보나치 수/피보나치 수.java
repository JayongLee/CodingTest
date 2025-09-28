class Solution {
    
    private static int[] fibodata;
    
    public int solution(int n) {
        fibodata = new int[n+1];
        initfibo();
        return fibo(n) % 1234567;
    }
    
    private static int fibo(int n) {
        if (fibodata[n] != 0) return fibodata[n];
        if (n <= 2) return 1;
        else {
            fibodata[n] = (fibo(n-1) + fibo(n-2)) % 1234567;
            return fibodata[n];
        }
        
    } 
    
    private static void initfibo() {
        fibodata[0] = 0;
        fibodata[1] = 1;
        fibodata[2] = 1;
    }
}