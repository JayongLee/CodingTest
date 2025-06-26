import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int count = 0;
        while (number.length() != 1) {
            int next = 1;
            for (int i = 0; i < number.length(); i++) {
                next *= Integer.parseInt(number.charAt(i) + "");
            }
            count++;
            number = String.valueOf(next);
        }
        System.out.println(count);
    }
}