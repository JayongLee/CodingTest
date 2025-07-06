import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> serialNums = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            serialNums.add(br.readLine());
        }
        serialNums.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    if (sumOfString(o1) == sumOfString(o2)) {
                        if (o1.compareTo(o2) < 0) {
                            return -1;
                        } else return 1;
                    } else if (sumOfString(o1) < sumOfString(o2)) return -1;
                    else return 1;
                } else if (o1.length() < o2.length()) return -1;
                else return 1;
            }
        });
        for (String serial : serialNums) {
            System.out.println(serial);
        }
    }

    private static int sumOfString(String o1) {
        int sum = 0;
        for (char c : o1.toCharArray()) {
            if ('0' <= c && c <= '9') {
                sum += c - '0';
            }
        }
        return sum;
    }
}