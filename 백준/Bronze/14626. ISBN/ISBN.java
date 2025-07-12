import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine();
        int checkSum = 0;
        char[] chars = isbn.toCharArray();
        int secretWeight = 0;
        for (int i = 0; i < isbn.length(); i++) {
            int weight = i % 2 == 0 ? 1 : 3;
            if (chars[i] == '*') {
                secretWeight = weight;
                continue;
            }
            int num = chars[i] - '0';
            checkSum += weight * num;
        }
        int ans = 0;
        while (true) {
            if ((checkSum + secretWeight * ans) % 10 == 0) {
                System.out.println(ans);
                return;
            }
            ans++;
        }
    }
}