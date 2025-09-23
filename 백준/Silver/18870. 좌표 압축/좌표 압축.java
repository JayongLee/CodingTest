import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] copy = new int[N];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            copy[i] = num;
        }
        Arrays.sort(copy);
        HashMap<Integer, Integer> rank = new HashMap<>();
        int ranking = 0;
        int before = 1_000_001;
        for (int num : copy) {
            if (before == num) {
                continue;
            }
            rank.put(num, ranking++);
            before=num;
        }
        StringBuilder sb = new StringBuilder();
        for (int n : arr) {
            sb.append(rank.get(n)).append(" ");
        }
        System.out.println(sb);
    }
}
