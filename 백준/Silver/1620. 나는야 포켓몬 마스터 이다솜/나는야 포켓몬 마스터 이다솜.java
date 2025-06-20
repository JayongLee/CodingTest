import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M  = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> numMap = new HashMap<>();
        HashMap<String, Integer> nameMap = new HashMap<>();
        for (int i = 1; i <= M; i++) {
            String name = br.readLine();
            nameMap.put(name, i);
            numMap.put(i, name);
        }
        for (int i = 1; i <= N; i++) {
            String quiz = br.readLine();
            if (nameMap.containsKey(quiz)) {
                System.out.println(nameMap.get(quiz));
            } else {
                System.out.println(numMap.get(Integer.parseInt(quiz)));
            }
        }
    }
}
