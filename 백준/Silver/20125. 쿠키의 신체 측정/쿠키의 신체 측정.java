import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int heart_row = 0;
        int heart_col = 0;
        char[][] board = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            board[i] = line.toCharArray();
            if (line.contains("***")) {
                heart_row = i;
            }
        }
        int start_arm = 0;
        int end_arm = 0;
        for (int i = 0; i < N; i++) {
            if (board[heart_row][i] == '*') {
                if (i == 0) start_arm = 0;
                else if (i == N - 1) end_arm = N -1;
                else if (board[heart_row][i - 1] == '_') start_arm = i;
                else if (board[heart_row][i + 1] == '_') end_arm = i;
            }
            if (board[heart_row - 1][i] == '*' && board[heart_row + 1][i] == '*') {
                heart_col = i;
            }
        }
        int left_arm = heart_col - start_arm;
        int right_arm = end_arm - heart_col;

        int back = 0;
        int right_leg = 0;
        int left_leg = 0;
        int back_index = heart_row + 1;
        while (board[back_index][heart_col] == '*') {
            back++;
            back_index++;
        }
        int left_index = back_index;
        int right_index = back_index;
        while (board[left_index][heart_col - 1] == '*' || board[right_index][heart_col + 1] == '*') {
            if (board[left_index][heart_col - 1] == '*') {
                left_leg++;
                left_index++;
            }
            if (board[right_index][heart_col + 1] == '*') {
                right_leg++;
                right_index++;
            }
            if (left_index >= N || right_index >= N) {
                break;
            }
        }

        System.out.println(++heart_row + " " + ++heart_col);
        System.out.println(left_arm + " " + right_arm + " " + back + " " + left_leg + " " + right_leg);
    }
}
