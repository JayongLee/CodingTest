import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int[] score = new int[k];
            for (int j = 0; j < k; j++) {
                score[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(score);
            int max = score[score.length - 1];
            int min = score[0];
            int maxGap = 0;
            for (int j = 0; j < k - 1; j++) {
                if (score[j+1] - score[j] > maxGap) {
                    maxGap = score[j+1] - score[j];
                }
            }
            System.out.println("Class " + (i+1));
            System.out.println("Max " + max + ", Min " + min + ", Largest gap " + maxGap);
        }

    }
}