import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        HashMap<String, Integer> halli_galli = new HashMap<>();

        String answer = "NO";

        for(int i = 0; i < N; i++) {
            String fruit = scanner.next();
            int count = scanner.nextInt();

            if(halli_galli.containsKey(fruit)) {
                halli_galli.replace(fruit, halli_galli.get(fruit) + count);
            } else {
                halli_galli.put(fruit, count);
            }
        }
        if(halli_galli.containsValue(5)) {
            answer = "YES";
        }

        System.out.println(answer);
    }


}