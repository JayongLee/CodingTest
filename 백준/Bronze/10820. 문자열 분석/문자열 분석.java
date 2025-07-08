import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String sentence = br.readLine();
            if (sentence == null) break;

            int small = 0;
            int big = 0;
            int blank = 0;
            int number = 0;
            
            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                if ('a' <= c && c <= 'z') small++;
                else if ('A' <= c && c <= 'Z') big++;
                else if (c == ' ') blank++;
                else number++;
            }

            System.out.println(small + " " + big + " " + number + " " + blank);
        }
    }
}