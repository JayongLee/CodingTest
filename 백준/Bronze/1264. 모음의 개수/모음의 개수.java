import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> aeiou = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        while (true) {
            String sentence = br.readLine();
            if (sentence.equals("#")) {
                break;
            }
            int count = 0;
            for (char c : sentence.toLowerCase().toCharArray()) {
                if (aeiou.contains(c)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}