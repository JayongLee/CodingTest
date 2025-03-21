import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int index = 0;

        for (int i = 0; i < N; i++) {
            int next = Integer.parseInt(br.readLine());

            if (next == 0) {
                index -= 1;
                continue;
            }
            stack[index] = next;
            index += 1;
        }

        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += stack[i];
        }

        System.out.println(sum);
    }
}