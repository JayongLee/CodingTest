import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] task = new int[N][2];

        for (int i = 0; i < N; i++) {
            task[i][0] = scanner.nextInt(); // start time
            task[i][1] = scanner.nextInt(); // end time
        }

        // 끝나는 시간 기준으로 정렬
        Arrays.sort(task, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });

        int count = 0;
        int end_time = 0;

        for (int[] t : task) {
            if (t[0] >= end_time) {
                count++;
                end_time = t[1];
            }
        }

        System.out.println(count);
    }
}