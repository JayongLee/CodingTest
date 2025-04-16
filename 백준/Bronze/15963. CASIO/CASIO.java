import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.time.ZoneOffset.UTC;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        String m = st.nextToken();
        if (n.equals(m)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

