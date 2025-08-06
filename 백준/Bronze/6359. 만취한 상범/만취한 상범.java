import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] room = new int[n+1];
            for (int j = 1; j <= n; j++) {
                room[j] = 1;
            }
            for (int r = 2; r <= n; r++) {
                for (int l = r; l <= n; l+=r) {
                    if (room[l] == 0) room[l] = 1;
                    else room[l] = 0;
                }
            }
            int count = 0;
            for (int s = 1; s <= n; s++) {
                if (room[s] == 1) count++;
            }
            System.out.println(count);
        }
    }
}