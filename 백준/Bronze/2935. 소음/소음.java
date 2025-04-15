import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String s = br.readLine();
        String B = br.readLine();
        if (s.equals("*")) {
            System.out.println(A + "0".repeat(B.length() - 1));
        } else {
            if (A.length() > B.length()) {
                StringBuilder sb = new StringBuilder(A);
                sb.setCharAt(A.length() - B.length(), '1');
                System.out.println(sb);
            } else if (B.length() > A.length()) {
                StringBuilder sb = new StringBuilder(B);
                sb.setCharAt(B.length() - A.length(), '1');
                System.out.println(sb);
            } else {
                StringBuilder sb = new StringBuilder(A);
                sb.setCharAt(0, '2');
                System.out.println(sb);
            }
        }
    }
}

