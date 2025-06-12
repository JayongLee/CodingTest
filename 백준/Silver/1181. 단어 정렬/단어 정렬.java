import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (list.contains(s)) {
                continue;
            }
            list.add(s);
        }

        list.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));

        for (String s : list) {
            System.out.println(s);
        }
    }
}