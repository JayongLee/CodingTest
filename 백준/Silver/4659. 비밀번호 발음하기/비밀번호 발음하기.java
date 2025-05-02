import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String aeiou = "aeiou";
        while (true){
            boolean pass = true;
            String pwd = br.readLine();
            if (pwd.equals("end")){
                break;
            }

            // case 1
            if (!pwd.contains("a") && !pwd.contains("e") && !pwd.contains("i") && !pwd.contains("o") && !pwd.contains("u")) {
                System.out.println("<" + pwd + "> is not acceptable.");
                continue;
            }

            for (int i = 0; i < pwd.length(); i++) {

                // case 3
                if (i != 0) {
                    if (pwd.charAt(i) == pwd.charAt(i - 1) && pwd.charAt(i) != 'e' && pwd.charAt(i) != 'o') {
                        pass = false;
                        break;
                    }
                }

                // case 2
                if (i >= 2) {
                    int count = 0;
                    char ch1 = pwd.charAt(i - 2);
                    char ch2 = pwd.charAt(i - 1);
                    char ch3 = pwd.charAt(i);
                    if (aeiou.contains(String.valueOf(ch1))) {
                        count++;
                    }
                    if (aeiou.contains(String.valueOf(ch2))) {
                        count++;
                    }
                    if (aeiou.contains(String.valueOf(ch3))) {
                        count++;
                    }
                    if (count == 0 || count == 3) {
                        pass = false;
                        break;
                    }
                }
            }
            if (pass) {
                System.out.println("<" + pwd + "> is acceptable.");
            } else {
                System.out.println("<" + pwd + "> is not acceptable.");
            }
        }
    }
}
