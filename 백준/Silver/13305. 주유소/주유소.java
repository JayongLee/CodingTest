import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] road = new long[N-1];
        for (int i = 0; i < N-1; i++) {
            road[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        long[] price = new long[N];
        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(st1.nextToken());
        }

        // 해당 주유소보다 싼 주유소를 만나기 전까진 해당 주유소에서 주유
        long total_price = 0;
        int cheap_idx = 0;
        for (int i = 0; i < N - 1; i++) {
            if (price[i] < price[cheap_idx]) {
                cheap_idx = i;
                total_price += price[cheap_idx] * road[i];
            } else {
                total_price += price[cheap_idx] * road[i];
            }
        }
        System.out.println(total_price);
    }
}