    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] alpha = new int[26];
            String s = br.readLine();
            char[] arr = s.toCharArray();
            for (char c : arr) {
                int index = c - 'a';
                alpha[index]++;
            }
            for (int i = 0; i < alpha.length; i++) {
                System.out.print(alpha[i] + " ");
            }
        }
    }

