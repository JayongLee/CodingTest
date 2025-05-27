import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 플레이어의 수
        int p = Integer.parseInt(st.nextToken());
        // 방의 정원
        int m = Integer.parseInt(st.nextToken());

        String[][] room = new String[p][m];
        int[] entrance_level = new int[p];
        int[] last_idx = new int[p];

        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            // 레벨
            int l = Integer.parseInt(st.nextToken());
            // 플레이어 아이디
            String s = st.nextToken();

            for(int room_num = 0; room_num < p; room_num++) {
                // 비어있는 방
                if (room[room_num][0] == null) {
                    room[room_num][0] = l + " " + s;
                    entrance_level[room_num] = l;
                    break;
                } else {
                    // 레벨 차 10 이하만 방 입장 가능
                    if (Math.abs(l - entrance_level[room_num]) <= 10 && last_idx[room_num] < (m-1)) {
                        last_idx[room_num] += 1;
                        room[room_num][last_idx[room_num]] = l + " " + s;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < p; i++) {
            if (room[i][0] == null) {
                break;
            }
            if (last_idx[i] == m-1) {
                System.out.println("Started!");
            } else {
                System.out.println("Waiting!");
            }
            Arrays.sort(room[i], 0, last_idx[i] + 1, Comparator.comparing(s -> s.split(" ")[1]));
            for (int j = 0; j <= last_idx[i]; j++) {
                System.out.println(room[i][j]);
            }
        }
    }
}