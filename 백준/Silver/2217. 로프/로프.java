import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ropes = new int[N];
        for (int i = 0; i < N; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes);

        int minWeight = Integer.MAX_VALUE;
        int maxCarry = 0;
        for (int count = 1; count <= N; count++) {
            for (int idx = 0; idx < count; idx++) {
                if (idx == count - 1) {
                    minWeight = ropes[N - idx - 1];
                    int nowCarry = minWeight * count;
                    if (maxCarry < nowCarry) {
                        maxCarry = nowCarry;
                    }
                }

            }
        }
        System.out.println(maxCarry);
    }
}