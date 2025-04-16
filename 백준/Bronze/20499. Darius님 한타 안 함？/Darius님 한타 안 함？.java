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
        String kda = br.readLine();
        String[] kdaArr = kda.split("/");
        if (Integer.parseInt(kdaArr[0]) + Integer.parseInt(kdaArr[2]) < Integer.parseInt(kdaArr[1]) || Integer.parseInt(kdaArr[1]) == 0) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}

