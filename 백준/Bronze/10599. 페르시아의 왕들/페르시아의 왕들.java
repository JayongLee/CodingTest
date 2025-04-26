import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int birth_a = Integer.parseInt(st.nextToken());
            int birth_b = Integer.parseInt(st.nextToken());
            int death_a = Integer.parseInt(st.nextToken());
            int death_b = Integer.parseInt(st.nextToken());
            if (birth_a == 0 && birth_b == 0 && death_a == 0 && death_b == 0) {
                break;
            }

            int age_a = death_a - birth_a;
            int age_b = death_a - birth_b;
            int age_c = death_b - birth_a;
            int age_d = death_b - birth_b;
            System.out.println(Math.min(Math.min(age_a, age_b), Math.min(age_c, age_d)) + " " + Math.max(Math.max(age_c, age_d), Math.max(age_a, age_b)));
        }
    }
}

