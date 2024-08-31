import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            array.add(num);
        }
        Collections.sort(array);

        for (Integer i : array) {
            System.out.println(i);
        }
    }

}