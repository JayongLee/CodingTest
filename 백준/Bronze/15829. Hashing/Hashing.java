import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String hash = br.readLine();
        long hash_value = 0;
        for (int i = 0; i < hash.length(); i++){
            long multi = 1;
            for (int j = 1; j <= i; j++){
                multi = (multi * 31) % 1234567891;
            }
            hash_value = (hash_value + (hash.charAt(i) - 'a' + 1) * multi) % 1234567891;
        }
        System.out.println(hash_value);
    }
}
