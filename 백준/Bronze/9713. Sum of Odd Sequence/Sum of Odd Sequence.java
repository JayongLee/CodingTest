import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int odd = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int j = 1; j <= odd; j+=2) sum += j;
            System.out.println(sum);
        }
    }
}
