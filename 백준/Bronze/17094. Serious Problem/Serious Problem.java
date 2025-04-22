import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int two = 0;
        int e = 0;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == '2') {
                two++;
            } else if (c == 'e') {
                e++;
            }
        }
        if (two == e) {
            System.out.println("yee");
        } else if (two > e) {
            System.out.println("2");
        } else {
            System.out.println("e");
        }
    }
}

