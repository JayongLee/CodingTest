import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;

        for (int row = 1; row < 9; row++) {
            char[] chess = br.readLine().toCharArray();
            if (row % 2 != 0) {
                for (int i = 0; i < chess.length; i += 2) {
                    if (chess[i] == 'F') {
                        ans += 1;
                    }
                }
            } else {
                for (int i = 1; i < chess.length; i += 2) {
                    if (chess[i] == 'F') {
                        ans += 1;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}