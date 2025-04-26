    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int seed = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if ((i * seed + j) % m == x1 && (i * x1 + j) % m == x2) {
                        System.out.println(i + " " + j);
                        return;
                    }
                }
            }
        }
    }

