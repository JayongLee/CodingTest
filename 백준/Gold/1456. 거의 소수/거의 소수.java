import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double sqrtB = Math.sqrt(B); // 최소 제곱부터니까
        int[] prime = new int[(int) sqrtB + 2];
        prime[2] = 2;
        for (int i = 3; i <= (int) sqrtB + 1; i+=2) {
            prime[i] = i;
        }
        // 에라스토테네스의 체
        for (int i = 3; i <= (int) sqrtB + 1; i+=2) {
            if (prime[i] == 0) {
                continue;
            }
            for (int j = i * 2; j <= (int) sqrtB + 1; j += i) {
                prime[j] = 0;
            }
        }
        int count = 0;
        for (double i = 3; i <= (int) sqrtB + 1; i += 2) {
            if (prime[(int) i] == 0) continue;
            double sqr = i;
            while (!(sqr > B)) {
                sqr *= i;
                if (A <= sqr && sqr <= B) {
                    count++;
                }
            }
        }
        double sqrTwo = 2;
        while(!(sqrTwo > B)) {
            sqrTwo *= 2;
            if (A <= sqrTwo && sqrTwo <= B) {
                count++;
            }
        }
        System.out.println(count);
    }
}