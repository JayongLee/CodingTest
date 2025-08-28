import java.util.*;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        
        String answer = "";
        for (int i = charArr.length - 1; i >= 0; i--) {
            answer += charArr[i];   
        }
        return Long.parseLong(answer);
    }
}