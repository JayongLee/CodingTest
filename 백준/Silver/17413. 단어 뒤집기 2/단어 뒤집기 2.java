import java.io.*;
import java.util.*;

public class Main {

    private static final Stack<Character> words = new Stack<>();
    private static final Queue<Character> tags = new LinkedList<>();
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        for (char c : chars) {
            if (c == '<') {
                appendWords();
                tags.offer(c);
            } else if (c == '>') {
                tags.offer(c);
                appendTags();
            } else if (!tags.isEmpty()) {
              tags.offer(c);
            } else if (c == ' ') {
                appendWords();
                sb.append(c);
            } else {
                words.add(c);
            }
        }
        appendWords();
        System.out.println(sb);
    }

    private static void appendWords() {
        while (!words.isEmpty()) {
            sb.append(words.pop());
        }
    }

    private static void appendTags() {
        while (!tags.isEmpty()) {
            sb.append(tags.poll());
        }
    }
}