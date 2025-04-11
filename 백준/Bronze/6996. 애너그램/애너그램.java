import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static boolean solveAnagrams(String first, String second ) {

        char[] chars_a = first.toCharArray();
        char[] chars_b = second.toCharArray();

        Arrays.sort(chars_a);
        Arrays.sort(chars_b);

        if (first.length() != second.length()) {
            return false;
        }
        for (int j = 0; j < chars_a.length; j++) {
            if (chars_a[j] != chars_b[j]) {
                return false;
            }
        }
        return true;
        /* -------------------- END OF INSERTION --------------------*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
