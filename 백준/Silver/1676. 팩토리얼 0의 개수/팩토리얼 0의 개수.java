import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger factorial = new BigInteger("1");
        for (int i = 2; i <= N; i++) {
            BigInteger big_i = new BigInteger(i + "");
            factorial = factorial.multiply(big_i);
        }
        String ans = String.valueOf(factorial);
        char[] chars = ans.toCharArray();
        int count = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '0') count++;
            else {
                System.out.println(count);
                return;
            }
        }
    }
}