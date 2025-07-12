import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] fizzbuzz = new String[3];
        fizzbuzz[0]= br.readLine();
        fizzbuzz[1] = br.readLine();
        fizzbuzz[2] = br.readLine();
        for (int i = 0; i < 3; i++) {
            if (!fizzbuzz[i].equals("Fizz") && !fizzbuzz[i].equals("Buzz")
                    && !fizzbuzz[i].equals("FizzBuzz")) {
                int plus = 3 - i;
                int nextNum = Integer.parseInt(fizzbuzz[i]) + plus;
                if (nextNum % 3 == 0 && nextNum % 5 == 0) {
                    System.out.println("FizzBuzz");
                    return;
                } else if (nextNum % 3 == 0) {
                    System.out.println("Fizz");
                    return;
                } else if (nextNum % 5 == 0) {
                    System.out.println("Buzz");
                    return;
                } else {
                    System.out.println(nextNum);
                    return;
                }
            }
        }
    }
}