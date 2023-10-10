import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int black_jack = scanner.nextInt();

        int max = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < n - 2; i++){
            for (int j = i + 1; j < n - 1; j++){
                for (int k = j + 1; k < n; k++){

                    if ((black_jack >= (arr[i] + arr[j] + arr[k])) && (max < (arr[i] + arr[j] + arr[k]))){
                        max = arr[i] + arr[j] + arr[k];
                    }
                }
            }
        }
        System.out.println(max);
    }
}
