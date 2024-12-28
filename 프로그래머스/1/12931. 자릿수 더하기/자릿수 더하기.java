import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String temp = "" + n;
        char[] temp_char = temp.toCharArray();

        for (char c : temp_char) {
            answer += Integer.parseInt(Character.toString(c));
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}