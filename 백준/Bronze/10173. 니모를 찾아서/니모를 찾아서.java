import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String sentence = br.readLine();
            if (sentence.equals("EOI")) {
                break;
            }
            sentence = sentence.toUpperCase();
            if (sentence.contains("NEMO")) {
                System.out.println("Found");
            } else {
                System.out.println("Missing");
            }
        }
    }
}