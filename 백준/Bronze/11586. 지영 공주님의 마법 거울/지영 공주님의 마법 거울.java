import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] face = new char[N][N];
        for (int i = 0; i < N; i++) {
            char[] rows = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                face[i][j] = rows[j];
            }
        }
        int K = Integer.parseInt(br.readLine());
        switch (K) {
            case 1:
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(face[i][j]);
                    }
                    System.out.println();
                }
                break;

                case 2:
                    for (int i = 0; i < N; i++) {
                        for (int j = N -1 ; j >= 0; j--) {
                            System.out.print(face[i][j]);
                        }
                        System.out.println();
                    }
                    break;

            case 3:
                for (int i = N -1 ; i >= 0; i--) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(face[i][j]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}