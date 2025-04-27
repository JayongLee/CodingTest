
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int player1 = 0;
            int player2 = 0;
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String p1 = st.nextToken();
                String p2 = st.nextToken();
                if (p1.equals(p2)) {
                    continue;
                }
                if (p1.equals("R")) {
                    if (p2.equals("S")) {
                        player1++;
                    } else {
                        player2++;
                    }
                } else if (p1.equals("S")) {
                    if (p2.equals("P")) {
                        player1++;
                    } else {
                        player2++;
                    }
                } else {
                    if (p2.equals("R")) {
                        player1++;
                    } else {
                        player2++;
                    }
                }
            }
            if (player1 > player2) {
                System.out.println("Player 1");
            } else if (player1 < player2) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }
        }
    }
}