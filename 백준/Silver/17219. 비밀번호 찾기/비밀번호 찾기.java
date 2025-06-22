import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M  = Integer.parseInt(st.nextToken());
        int N  = Integer.parseInt(st.nextToken());
        HashMap<String, String> passwords = new HashMap<>();
        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String password = st.nextToken();
            passwords.put(site, password);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++){
            String site = br.readLine();
            sb.append(passwords.get(site)).append('\n');
        }
        System.out.println(sb.toString());
    }
}
