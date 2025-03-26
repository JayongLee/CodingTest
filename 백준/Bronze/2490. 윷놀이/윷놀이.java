import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        print(countOne(st1));
        print(countOne(st2));
        print(countOne(st3));

    }

    private static int countOne(StringTokenizer st) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (st.nextToken().equals("1")) {
                count += 1;
            }
        }
        return count;
    }

    private static void print(int one) {
        switch (one) {
            case 1:
                System.out.println("C");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("A");
                break;
            case 4:
                System.out.println("E");
                break;
            default:
                System.out.println("D");
        }
    }

}