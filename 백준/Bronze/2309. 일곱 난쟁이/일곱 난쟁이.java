    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.time.*;
    import java.util.Arrays;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] height = new int[9];
            for (int i = 0; i < 9; i++) {
                int h = Integer.parseInt(br.readLine());
                height[i] = h;
            }
            Arrays.sort(height);
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                for (int j = i+1; j < 9; j++) {
                    for (int l = 0; l < 9; l++) {
                        if (l == i || l == j) {
                            continue;
                        }
                        sum += height[l];
                    }
                    if (sum == 100) {
                        for (int k = 0; k < 9; k++) {
                            if (k == i || k == j) {
                                continue;
                            }
                            System.out.println(height[k]);
                        }
                        return;
                    } else {
                        sum = 0;
                    }
                }
            }
        }
    }

