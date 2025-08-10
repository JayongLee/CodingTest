import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> wordSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            wordSet.add(br.readLine());
        }
        HashSet<String> prefixSet = new HashSet<>();
        List<String> sorted = wordSet.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
        
        for (String word : sorted) {
            boolean flag = true;
            for (String prefix : prefixSet) {
                if (isPrefix(prefix, word)){
                    flag = false;
                    break;
                }
            }
            if (flag) prefixSet.add(word);
        }
        System.out.println(prefixSet.size());
    }

    private static boolean isPrefix(String word1, String word2) {
        if (word2.length() >= word1.length()) {
            return word1.equals(word2.substring(0, word1.length()));
        } else {
            return word2.equals(word1.substring(0, word2.length()));
        }
    }
}
