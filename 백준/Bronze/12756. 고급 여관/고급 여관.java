import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int attack1 = Integer.parseInt(st.nextToken());
        int life1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int attack2 = Integer.parseInt(st.nextToken());
        int life2 = Integer.parseInt(st.nextToken());

        int count1 = life1 % attack2 == 0 ? life1 / attack2 : life1 / attack2 + 1;
        int count2 = life2 % attack1 == 0 ? life2 / attack1 : life2 / attack1 + 1;

        if (count1 == count2) {
            System.out.println("DRAW");
        } else if (count1 > count2) {
            System.out.println("PLAYER A");
        } else {
            System.out.println("PLAYER B");
        }
    }
}

