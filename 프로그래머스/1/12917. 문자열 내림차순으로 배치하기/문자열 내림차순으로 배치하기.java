import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        ArrayList<Integer> st = new ArrayList<>();
        for (char c : s.toCharArray()) {
            st.add(c - 'A');
        }
        st.sort(Collections.reverseOrder());
        char[] ans = new char[st.size()];
        for (int i = 0; i < st.size(); i++) {
            ans[i] = (char)(st.get(i) + 65);
        }
        return new String(ans);
    }
}