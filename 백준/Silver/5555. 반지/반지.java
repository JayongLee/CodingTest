import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String sentence = br.readLine();
            sentence += sentence.substring(0, target.length() - 1);
            for (int j = 0; j < 10; j++) {
                if (target.equals(sentence.substring(j, j + target.length()))) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}