import java.util.*;
public class Main {

    public static int factorial(int n){
        int f = 1;
        for(int i = n; i > 0; i--){
           f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int ans = factorial(n)/(factorial(k)*factorial(n-k));
        System.out.println(ans);

        // n!/(k!(n-k))!

    }
        

}