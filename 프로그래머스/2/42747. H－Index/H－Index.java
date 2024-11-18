import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
//        int max = 0;
        ArrayList<Integer> h_set = new ArrayList<>();
        for (int h = 0; h < 10000; h++) {
            int up = 0;
            int down = 0;
            for (int i = 0; i < citations.length; i++) {
                int n = citations[i];
//                if (n >= max) max = n;
                if (n >= h) {
                    up += 1;
                } else down += 1;
            }
            if (up >= h && h >= down) {
                h_set.add(h);
            }
        }
        int answer = Collections.max(h_set);
        return answer;
    }
}