import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int test = Integer.parseInt(br.readLine());
            StringBuilder s = new StringBuilder();
            while (test > 0) {
                int remainder = test % 2;
                s.append(remainder);
                test = test / 2;
            }
            for (int j = 0; j < s.length(); j++) {
               if (s.charAt(j) == '1') {
                   System.out.print(j + " ");
               }
            }
        }
    }
}