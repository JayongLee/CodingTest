import java.sql.Array;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num[] = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int k = scanner.nextInt();
            if(num[i] == k) {
                num[i] = 0;
            }
            else {
                num[i] = num[i] - k;
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(num[i] + " ");
        }
    }
}