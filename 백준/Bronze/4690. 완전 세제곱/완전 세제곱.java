import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        for(int a = 3; a <= 100; a++) {
            for(int b = 2; b <= a; b++) {
                for(int c = b + 1; c <= a; c++) {
                    for(int d = c + 1; d <= a; d++) {
                        if (a * a * a == b * b * b + c * c * c + d * d * d) {
                            if (b != c && b != d && c != d) {
                                int[] arr = {b, c, d};
//                                Arrays.sort(arr);
                                System.out.println("Cube = " + a + ", Triple = (" + arr[0] + "," + arr[1] + "," + arr[2] + ")");
                            }
                        }
                    }
                }
            }
        }
    }
}