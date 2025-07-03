import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String next = br.readLine();
            map.put(next, map.getOrDefault(next, 0) + 1);
        }
        int max = 0;
        String key_idx = "";
        for (String key : map.keySet()) {
            if (map.get(key) == max) {
                BigInteger original = new BigInteger(key_idx);
                BigInteger new_key = new BigInteger(key);
                int compare = new_key.compareTo(original);
                if (compare < 0) {
                    key_idx = key;
                }
            }
            if (map.get(key) > max) {
                max = map.get(key);
                key_idx = key;
            }
        }
        System.out.println(key_idx);
    }
}