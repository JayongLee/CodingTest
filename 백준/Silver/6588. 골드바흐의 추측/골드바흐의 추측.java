import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxSize = 0;
        List<Integer> sizeList = new ArrayList<>();
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            if (N >= maxSize) {
                maxSize = N;
            }
            sizeList.add(N);
        }
        int[] primes = new int[maxSize + 1];
        for (int i = 3; i <= maxSize; i+=2) {
            primes[i] = i;
        }
        for (int i = 3; i <= maxSize; i+= 2) {
            if (primes[i] != 0) {
                for (int j = i*2; j <= maxSize; j+=i) {
                    primes[j] = 0;
                }
            }
        }
        for (int size : sizeList) {
            boolean isFind = false;
            for (int i = 3; i <= size; i+=2) {
                if (primes[size-i] != 0 && primes[i] != 0) {
                    isFind = true;
                    System.out.println(size + " = " + i + " + " + (size-i));
                    break;
                }
            }
            if (!isFind) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}