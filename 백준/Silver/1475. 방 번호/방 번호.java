import java.io.*;
import java.util.*;

public class Main {
    
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String N;

    public static void main(String[] args) throws Exception {
        N = br.readLine();
        HashMap<Integer, Integer> nums = new HashMap<>();
        for (char c : N.toCharArray()) {
            int num = c - '0';
            nums.put(num, nums.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for (int num : nums.keySet()) {
            if (num != 6 && num != 9) {
                max = Math.max(max, nums.getOrDefault(num, 0));
            }
        }
        int sixOrNine = nums.getOrDefault(6, 0 ) + nums.getOrDefault(9, 0);
        sixOrNine = sixOrNine % 2 == 0 ? sixOrNine / 2 : sixOrNine / 2 + 1;
        max = Math.max(max, sixOrNine);
        System.out.println(max);
    }
}