    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                StringBuilder sb = new StringBuilder(br.readLine());
                String start = sb.substring(0, 1).toUpperCase();
                System.out.println(start + sb.substring(1));
            }
        }
    }

