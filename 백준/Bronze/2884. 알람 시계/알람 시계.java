import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute >= 45) {
            minute -= 45;
        } else if (hour > 0) {
            hour -= 1;
            minute = 60 - (45 - minute);
        } else {
            hour = 23;
            minute = 60 - (45 - minute);
        }

        System.out.println(hour + " " + minute);
    }
}