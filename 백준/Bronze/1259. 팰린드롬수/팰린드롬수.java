import java.util.*;
public class Main {

    public static boolean palindrom(int n){
        String s = "" + n;
        int middle_index = s.length() / 2;
        for (int i = 0; i < middle_index; i++){
            if (s.charAt(i) != s.charAt(s.length() - (i + 1)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int k = scanner.nextInt();
            if (palindrom(k) && k != 0)
                System.out.println("yes");
            else if (k == 0) break;
            else System.out.println("no");
        }


    }
}
