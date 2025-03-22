import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cut = (int) Math.round((float) N * 0.15);

        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(score);

        int level = 0;

        for (int i = cut; i < N - cut; i++) {
            level += score[i];
        }

        System.out.println(Math.round((double)level / (double)(N - 2*cut)));
    }
}