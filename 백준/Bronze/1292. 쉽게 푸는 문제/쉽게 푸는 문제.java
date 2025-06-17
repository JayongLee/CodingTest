import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int sum = 0;
        int count = 0;
        int num = 1;
        while (true) {
            for (int i = 0; i < num; i++) {
                count++;
                if (start <= count && end >= count) {
                    sum += num;
                }
                if (count == end) {
                    System.out.println(sum);
                    return;
                }
            }
            num++;
        }
    }
}
