import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        sb.reverse();

        int subSum = 0;
        int index = 0;

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                subSum += (int) Math.pow(2, index);
            }
            if (index == 2 || i == (sb.length() - 1)) {
                ans.append(subSum);
                index = 0;
                subSum = 0;
                continue;
            }
            index += 1;
        }
        ans.reverse();
        System.out.println(ans);

    }
}