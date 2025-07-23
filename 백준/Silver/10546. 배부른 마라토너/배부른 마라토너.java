import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> runner = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            runner.put(name, runner.getOrDefault(name, 0) + 1);
        }
        for (int i = 0; i < N - 1; i++) {
            String name = br.readLine();
            runner.put(name, runner.get(name) - 1);
        }
        for (String name : runner.keySet()) {
            if (runner.get(name) % 2 != 0) {
                System.out.println(name);
                return;
            }
        }
    }
}