import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int first = Integer.parseInt(num);
        int count = 0;
        while  (true) {
            count++;
            num = num.length() < 2 ? "0" + num : num;
            String sum = (num.charAt(0) + - '0') + (num.charAt(1) + - '0') + "";
            int right = sum.charAt(sum.length() - 1) - '0';
            int left = num.charAt(num.length() - 1) - '0';
            num = (left + "") + (right + "");
            if (Integer.parseInt(num) == first) {
                System.out.println(count);
                return;
            }
        }
    }
}