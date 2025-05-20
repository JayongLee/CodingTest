import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer[]> rank = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int country = Integer.parseInt(st.nextToken());
            Integer[] medals = new Integer[3];
            for (int j = 0; j < 3; j++) {
                medals[j] = Integer.parseInt(st.nextToken());
            }
            rank.put(country, medals);
        }
        int ranking = 1;
        Integer[] t = rank.get(target);
        for (int i = 1; i <= rank.size(); i++) {
            if (i == target) continue;
            if (rank.get(i)[0] > t[0]) {
                ranking++;
            } else if (rank.get(i)[0] == t[0]) {
                if (rank.get(i)[1] > t[1]) {
                    ranking++;
                } else if (rank.get(i)[1] == t[1]) {
                    if (rank.get(i)[2] > t[2]) {
                        ranking++;
                    }
                }
            }
        }
        System.out.println(ranking);
    }
}