import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        HashMap<Integer, Integer> count = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[i] = num;
            count.put(num, count.getOrDefault(num, 0) + 1);
            sum += num;
        }
        Arrays.sort(numbers);
        long meanInt = Math.round((double) sum / N);
        int mid = numbers[numbers.length / 2];
        int range = numbers[numbers.length - 1] - numbers[0];
        List<Integer> modeList = new ArrayList<>();
        int maxCount = 0;
        for (int key : count.keySet()) {
            int value = count.get(key);
            if (value > maxCount) {
                maxCount = value;
                modeList.clear();
                modeList.add(key);
            } else if (value == maxCount) {
                modeList.add(key);
            }
        }

        Collections.sort(modeList);
        int most = modeList.size() > 1 ? modeList.get(1) : modeList.get(0);

        System.out.println(meanInt);
        System.out.println(mid);
        System.out.println(most);
        System.out.println(range);
    }
}