import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> testList = new ArrayList<>();
        int max = 0;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            if (n > max) max = n;
            testList.add(n);
        }
        max *= 2;
        int[] prime = new int[max+1];
        prime[2] = 2;
        for (int i = 3; i <= max; i+=2) {
            prime[i] = i;
        }
        for (int i = 3; i <= max; i+=2) {
            if (prime[i] == 0) {
                continue;
            }
            for (int j = i * 2; j <= max; j += i) {
                prime[j] = 0;
            }
        }
        testList.forEach(num -> {
            int count = 0;
            for (int i = num + 1; i <= 2*num; i++) {
                if (prime[i] != 0) count++;
            }
            System.out.println(count);
        });
    }
}