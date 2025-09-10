class Solution {
    public int[] solution(String s) {
        
        int transCount = 0;
        int zeroCount = 0;
        
        while (!s.equals("1")) {
            transCount++;
            int origianlLen = s.length();
            int tempLen = s.replaceAll("0", "").length();
            zeroCount += origianlLen - tempLen;
            s = Integer.toBinaryString(tempLen);
        }

        
        int[] answer = {transCount, zeroCount};
        return answer;
    }
}