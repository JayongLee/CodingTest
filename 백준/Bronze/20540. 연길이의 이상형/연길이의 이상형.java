import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(br.readLine());
        StringBuilder answer = new StringBuilder();

        switch (sb.charAt(0)) {
            case 'I' :
                answer.append('E');
                break;
            case 'E' :
                answer.append('I');
                break;
        }
        switch (sb.charAt(1)) {
            case 'S' :
                answer.append('N');
                break;
            case 'N' :
                answer.append('S');
                break;
        }
        switch (sb.charAt(2)) {
            case 'T' :
                answer.append('F');
                break;
            case 'F' :
                answer.append('T');
                break;
        }
        switch (sb.charAt(3)) {
            case 'J' :
                answer.append('P');
                break;
            case 'P' :
                answer.append('J');
                break;
        }

        System.out.println(answer.toString());
    }
}
