import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word1 = st.nextToken();
            String word2 = st.nextToken();
            System.out.print("Distances: ");
            for (int j = 0; j < word1.length(); j++) {
                int x = word1.charAt(j) - 'A';
                int y = word2.charAt(j) - 'A';
                int distance = y >= x ? y - x : y + 26 - x;
                System.out.print(distance + " ");
            }
            System.out.println();
        }
    }
}