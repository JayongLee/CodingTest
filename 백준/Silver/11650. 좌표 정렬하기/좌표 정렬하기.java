import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr_x = new int[N];
        int[] arr_y = new int[N];

        for (int i = 0; i < N; i++) {
            arr_x[i] = scanner.nextInt();
            arr_y[i] = scanner.nextInt();
        }

        merge_sort(arr_x, arr_y, 0, arr_x.length - 1);

        for (int i = 0; i < N; i++) {
            System.out.println(arr_x[i] + " " + arr_y[i]);
        }

    }

    public static void merge_sort(int[] x, int[] y, int p, int q) {
        if (p < q) {
            int k = (p+q) / 2;
            merge_sort(x, y, p, k);
            merge_sort(x, y, k+1, q);
            merge(x, y, p, k, q);
        }
    }

    public static void merge(int[] x, int[] y, int p, int k, int q) {
        int[] B = new int[q - p + 1];
        int[] C = new int[q - p + 1];
        int i = p;
        int j = k + 1;
        int l = 0;

        while (i <= k && j <= q) {
            if (x[i] < x[j]) {
                B[l] = x[i];
                C[l] = y[i];
                i++;
            } else if (x[i] > x[j]) {
                B[l] = x[j];
                C[l] = y[j];
                j++;
            } else {  // x[i] == x[j]
                if (y[i] <= y[j]) {
                    B[l] = x[i];
                    C[l] = y[i];
                    i++;
                } else {
                    B[l] = x[j];
                    C[l] = y[j];
                    j++;
                }
            }
            l++;
        }

        while (i <= k) {
            B[l] = x[i];
            C[l] = y[i];
            i++;
            l++;
        }

        while (j <= q) {
            B[l] = x[j];
            C[l] = y[j];
            j++;
            l++;
        }

        System.arraycopy(B, 0, x, p, B.length);
        System.arraycopy(C, 0, y, p, C.length);
    }
}