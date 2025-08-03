import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseCount = 1;
        while (true) {
            String next = br.readLine();
            if (next.equals("0 0 0")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(next);
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            int maxDay = V / P * L;
            int rest = Math.min(V % P, L);
            maxDay += rest;
            System.out.println("Case " + caseCount++ + ": " + maxDay);
        }

    }
}