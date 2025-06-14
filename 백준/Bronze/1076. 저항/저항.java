import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer[]> value = new HashMap<>();
        value.put("black", new Integer[]{0, 1});
        value.put("brown", new Integer[]{1, 10});
        value.put("red", new Integer[]{2, 100});
        value.put("orange", new Integer[]{3, 1000});
        value.put("yellow", new Integer[]{4, 10000});
        value.put("green", new Integer[]{5, 100000});
        value.put("blue", new Integer[]{6, 1000000});
        value.put("violet", new Integer[]{7, 10000000});
        value.put("grey", new Integer[]{8, 100000000});
        value.put("white", new Integer[]{9, 1000000000});

        long sum = 0;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            String color = br.readLine();
            temp.append(value.get(color)[0]);
        }
        String color = br.readLine();
        sum += Long.parseLong(temp.toString()) * value.get(color)[1];

        System.out.println(sum);
    }
}
