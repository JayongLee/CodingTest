import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        mergeSort(A, 0, N-1);
        for (int i : A) {
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] A, int p, int q) {
        if (p < q) {
            int k = (p + q) / 2;
            mergeSort(A, p, k);
            mergeSort(A, k + 1, q);
            merge(A, p, k, q);
        }
    }

    public static void merge(int[] A, int start, int pivot, int end) {
        int[] B = new int[end - start + 1];
        int i = start;
        int j = pivot + 1;
        int k = 0;

        while (i <= pivot && j <= end) {
            if (A[i] < A[j]) {
                B[k++] = A[i++];
            } else {
                B[k++] = A[j++];
            }
        }

        while (i <= pivot) {
            B[k++] = A[i++];
        }

        while (j <= end) {
            B[k++] = A[j++];
        }

        // 원래 배열로 복사
        System.arraycopy(B, 0, A, start, B.length);
    }

    public static void quickSort(int[] A, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(A, left, right);
            quickSort(A, left, pivotIndex - 1);
            quickSort(A, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] A, int left, int right) {
        int pivot = A[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= j && A[i] <= pivot) {
                i++;
            }
            while (i <= j && A[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(A, i, j);
            }
        }
        swap(A, left, j);
        return j;
    }

    public static void swap(int[] arr, int p, int q) {
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }
}