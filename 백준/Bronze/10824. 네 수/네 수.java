import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String first = st.nextToken() + st.nextToken();
        String second = st.nextToken() + st.nextToken();

        long A = Long.parseLong(first);
        long B = Long.parseLong(second);
        System.out.println(A + B);
    }
}
