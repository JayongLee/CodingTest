    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                int a = Integer.parseInt(br.readLine());
                if ((a & -a) == a) {
                    System.out.println(1);
                } else System.out.println(0);
            }
        }
    }

