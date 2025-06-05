import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int zero_tanos = 0;
        int one_tanos = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                zero_tanos++;
            } else if (S.charAt(i) == '1') {
                one_tanos++;
            }
        }

        zero_tanos = zero_tanos / 2;
        one_tanos = one_tanos / 2;

        int zero_count = 0;
        int one_count = 0;

        char[] S_arr = S.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = S_arr.length - 1; i >= 0; i--) {
            if (zero_count < zero_tanos && S_arr[i] == '0') {
                S_arr[i] = ' ';
                zero_count++;
            }
        }
        for (int i = 0; i < S_arr.length; i++) {
            if (one_count < one_tanos && S_arr[i] == '1') {
                S_arr[i] = ' ';
                one_count++;
            }
        }
        for (char c : S_arr) {
            if (c == ' ') continue;
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}