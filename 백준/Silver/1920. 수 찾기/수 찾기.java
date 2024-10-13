import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (int i = 0; i < N; i++) {
            treeSet.add(scanner.nextInt());
        }

        int M = scanner.nextInt();
        for (int i = 0; i < M; i++) {
            if (treeSet.contains(scanner.nextInt())) {
                System.out.println(1);
            } else System.out.println(0);
        }

    }
}