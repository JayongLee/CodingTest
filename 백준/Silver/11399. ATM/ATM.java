import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] time = new int[N];

        for(int i = 0; i < N; i++) {
            time[i] = scanner.nextInt();
        }

        Arrays.sort(time);

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += money_time(i, time);
        }

        System.out.println(sum);
    }

    public static int money_time(int i, int[] arr) {
        if (i == 0) {
            return arr[0];
        }

        return money_time(i-1, arr) + arr[i];
    }
}