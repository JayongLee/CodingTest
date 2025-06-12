import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] matrix = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            matrix[i][0] = x;
            matrix[i][1] = y;
        }

        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]) return 1;
                else if (o1[1] == o2[1]) {
                    if (o1[0] > o2[0]) return 1;
                    else if (o1[0] == o2[0]) return 0;
                    else return -1;
                } else
                    return -1;
            }
        });

        for (int[] row : matrix) {
            System.out.println(row[0] + " " + row[1]);
        }
    }
}