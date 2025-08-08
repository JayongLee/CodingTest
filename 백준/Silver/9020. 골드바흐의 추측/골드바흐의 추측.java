import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int max = 0;
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            max = Math.max(n, max);
            arr[i] = n;
        }
        int[] prime = createPrimeArr(max);
        for (int i = 0; i < arr.length; i++){
            int find = arr[i];
            for (int j = find / 2; j >= 0; j--) {
                if (prime[j] != 0 && prime[find - j] != 0) {
                    System.out.println(j + " " + (find - j));
                    break;
                }
            }
        }
    }

    private static int[] createPrimeArr(int size) {
        int[] prime = new int[size + 1];
        prime[2] = 2;
        for (int i = 3; i <= size; i+=2) {
            prime[i] = i;
        }
        for (int i = 3; i <= size; i+=2) {
            if (prime[i] == 0) {
                continue;
            }
            for (int j=i*2; j <= size; j+=i) {
                prime[j] = 0;
            }
        }
        return prime;
    }
}
