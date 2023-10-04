import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            int m = scanner.nextInt();
            int count = 0;
            for(int j = 2; j < m; j++){
                if (m % j == 0){
                    count += 1;
                }
            }
            if (count == 0 && m != 1){
                ans += 1;
            }

        }
        System.out.println(ans);
        
    }
        

}