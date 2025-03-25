import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[3];
        int[] c = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            c[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.print(c[0] - a[2]);
        System.out.print(" ");
        System.out.print(c[1] / a[1]);
        System.out.print(" ");
        System.out.print(c[2] - a[0]);
    }
}