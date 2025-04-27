
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int[] Bessie = {Integer.parseInt(st1.nextToken()), Integer.parseInt(st1.nextToken())};
        int[] Daisy = {Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken())};
        int[] John = {Integer.parseInt(st3.nextToken()), Integer.parseInt(st3.nextToken())};

        int Daisy_move = Math.abs(Daisy[0] - John[0]) + Math.abs(Daisy[1] - John[1]);

        int Bessie_move = 0;
        int x_gap = Math.abs(Bessie[0] - John[0]);
        int y_gap = Math.abs(Bessie[1] - John[1]);

        if (x_gap < y_gap) {
            Bessie_move = y_gap;
        } else {
            Bessie_move = x_gap;
        }

        if (Bessie_move < Daisy_move) {
            System.out.println("bessie");
        } else if (Bessie_move > Daisy_move) {
            System.out.println("daisy");
        } else {
            System.out.println("tie");
        }
    }
}