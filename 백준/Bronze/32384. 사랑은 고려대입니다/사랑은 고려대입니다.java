import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String love = "LoveisKoreaUniversity";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(love).append(" ");
        }
        System.out.println(sb);
    }
}