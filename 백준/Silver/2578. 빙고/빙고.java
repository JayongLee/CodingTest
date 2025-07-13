import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] bingo = new int[5][5];
        boolean[][] check = new boolean[5][5];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int next = Integer.parseInt(st.nextToken());
                findNum(bingo, check, next);
                count++;
            }
        }

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int next = Integer.parseInt(st.nextToken());
                findNum(bingo, check, next);
                count++;
                if (checkBing(check) >= 3) {
                    System.out.println(count);
                    return;
                }
            }
        }

    }

    private static void findNum(int[][] bingo, boolean[][] check, int num) {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (bingo[r][c] == num) {
                    check[r][c] = true;
                    return;
                }
            }
        }
    }

    private static int checkBing(boolean[][] check) {
        int bingo = 0;
        for (int i = 0; i < 5; i++) {
            boolean flag = true;
            for (int j = 0; j < 5; j++) {
                if (!check[i][j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) bingo++;
        }
        for (int col = 0; col < 5; col++) {
            boolean flag = true;
            for (int row = 0; row < 5; row++) {
                if (!check[row][col]) {
                    flag = false;
                    break;
                }
            }
            if (flag) bingo++;
        }
        boolean flag1 = true;
        boolean flag2 = true;
        for (int cross = 0; cross < 5; cross++) {
            if (!check[cross][cross]) {
                flag1 = false;
            }
            if (!check[5 - (cross + 1)][cross]) {
                flag2 = false;
            }
        }
        if (flag1) bingo++;
        if (flag2) bingo++;

        return bingo;
    }
}