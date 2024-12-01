import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<String, TreeSet<String>> idol = new HashMap<>();

        // 입력 받을 걸그룹의 수
        int N = Integer.parseInt(st.nextToken());
        // 맞춰야하는 문제의 수
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            String group_name = br.readLine();
            int member_size = Integer.parseInt(br.readLine());
            TreeSet<String> members = new TreeSet<>();
            for (int j = 0; j < member_size; j++) {
                members.add(br.readLine());
            }
            idol.put(group_name, members);
        }

        for(int i = 0; i < M; i++) {
            String quiz = br.readLine();
            // 1이면 quiz가 멤버 이름 , 0이면 quiz가 그룹 이름
            int sort = Integer.parseInt(br.readLine());
            
            if (sort == 0) {
                // 멤버를 사전순으로 출력
                String[] answer = idol.get(quiz).toArray(new String[0]);
                for(String member : answer) {
                    System.out.println(member);
                }
            } else {
                for(String group : idol.keySet()) {
                    if(idol.get(group).contains(quiz)) {
                        System.out.println(group);
                    }
                }
            }
        }
    }


}