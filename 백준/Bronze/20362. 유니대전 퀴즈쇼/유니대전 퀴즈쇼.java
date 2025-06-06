import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String ansUser = st.nextToken();
        Map<String, Integer> chat = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String user = st.nextToken();
            String ans = st.nextToken();

            if (user.equals(ansUser)) {
                System.out.println(chat.getOrDefault(ans, 0));
                return;
            }

            chat.put(ans, chat.getOrDefault(ans, 0) + 1);
        }
    }
}