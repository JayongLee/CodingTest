import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[6];
        for (int i=0; i < 6; i++) {
            arr[i] = scanner.nextInt();
        }

        int T = scanner.nextInt();
        int P = scanner.nextInt();

        int pen = N / P;
        int one_pen = N % P;

        int count = 0;

        for (int i=0; i < 6; i++) {
            if (arr[i] % T == 0) {
                count += arr[i] / T;
            } else {
                count += (arr[i] / T) + 1;
            }
        }

        System.out.println(count);
        System.out.println(pen + " " + one_pen);
    }
}