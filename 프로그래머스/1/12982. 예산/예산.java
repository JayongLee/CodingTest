import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int result = 0;
        for (int i = 0; i < d.length && budget > 0; i++) {
            if (budget >= d[i]) {
                result++;
                budget -= d[i];
            }
        }
        return result;
    }
}