import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        int[] number = new int[10001];
        for (int i = 1; i <= 10000; i++) {
            String s = String.valueOf(i);
            char[] chars = s.toCharArray();
            int creator = 0;
            for (int j = 0; j < chars.length; j++) {
                creator += chars[j] - '0';
            }
            creator += Integer.parseInt(s);
            if (creator <= 10000) {
                number[creator] = 1;
            }
        }
        for (int i = 1; i <= 10000; i++) {
            if (number[i] != 1) {
                System.out.println(i);
            }
        }
    }
}
