import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[] s = br.readLine().toCharArray();

        for (int i = 0; i < N-1; i++) {
            char[] new_command = br.readLine().toCharArray();
            for (int j = 0; j < s.length; j++) {
                if (s[j] != new_command[j]) s[j] = '?';
            }
        }
        System.out.println(s);
    }
}