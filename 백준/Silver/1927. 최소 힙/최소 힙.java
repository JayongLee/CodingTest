import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        for (int i = 0; i < n; i++){
            int x = Integer.parseInt(br.readLine());
            if (x == 0){
                if (min_heap.isEmpty())
                    System.out.println(0);
                else {
                    System.out.println(min_heap.poll());
                }
            }
            else {
                min_heap.add(x);
            }
        }

    }
}
