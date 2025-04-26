import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringBuilder sb = new StringBuilder(br.readLine());
            if (sb.toString().equals("END")) {
                break;
            }
            System.out.println(sb.reverse());
        }
    }
}

