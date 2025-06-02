import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> words = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() < M) {
                continue;
            }
            words.put(word, words.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(words.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (!o1.getValue().equals(o2.getValue())) {
                    return o1.getValue() - o2.getValue();
                } else if (o1.getKey().length() != o2.getKey().length()) {
                    return o1.getKey().length() - o2.getKey().length();
                } else {
                    return o2.getKey().compareTo(o1.getKey());
                }
            }
        }.reversed());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Map.Entry<String, Integer> entry : list) {
            bw.write(entry.getKey() + "\n");
        }
        bw.flush();
        bw.close();
    }
}