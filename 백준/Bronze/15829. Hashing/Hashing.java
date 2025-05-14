import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String hash = br.readLine();
        long hash_value = 0L;
        for (int i = 0; i < hash.length(); i++){
            hash_value += (long) ((hash.charAt(i) - 'a' + 1) * Math.pow(31, i));
        }
        System.out.println(hash_value);
    }
}
