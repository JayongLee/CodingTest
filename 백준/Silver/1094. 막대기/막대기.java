    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int X = Integer.parseInt(br.readLine());
            int length = 0;
            int shortest = 64;
            int count = 0;
            // 가지고 있는 나무의 길이의 합이 X보다 작을 때까지
            while (length + shortest >= X) {
                if (length + shortest == X) {
                    length += shortest;
                    count++;
                    break;
                }
                // 현재 나무의 가장 짧은 부분을 반으로 자른 뒤, 합을 계산했을 때 X보다 크거나 같다면
                if (shortest / 2 + length >= X) {
                    // 자른 절반을 버림
                    shortest = shortest / 2;
                } else {
                    // 아니면 가장 짧은 것의 길이 = 절반
                    shortest = shortest / 2;
                    length += shortest;
                    count++;
                }
            }
            System.out.println(count);
        }
    }

