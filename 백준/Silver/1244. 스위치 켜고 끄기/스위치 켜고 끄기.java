import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] switches = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            switches[i] = Integer.parseInt(st.nextToken());
        }
        int students = Integer.parseInt(br.readLine());

        for (int i = 0; i < students; i++) {
            StringTokenizer st_student = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st_student.nextToken());
            if (gender == 1) {
                int man = Integer.parseInt(st_student.nextToken());
                man_switch(man, switches);
            } else {
                int woman = Integer.parseInt(st_student.nextToken());
                woman_switch(woman, switches);
            }
        }

        for (int i = 1; i < switches.length; i++) {
            System.out.print(switches[i] + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }

    private static void man_switch(int man, int[] switches) {
        for (int i = man; i < switches.length; i += man) {
            switches[i] = switches[i] == 1 ? 0 : 1;
        }
    }

    private static void woman_switch(int woman, int[] switches) {
        int k = 0;
        while (true) {
            if (woman - k <= 0 || woman + k >= switches.length) break;
            if (switches[woman - k] != switches[woman + k]) break;

            if (k == 0) {
                switches[woman] = switches[woman] == 1 ? 0 : 1;
            } else {
                switches[woman - k] = switches[woman - k] == 1 ? 0 : 1;
                switches[woman + k] = switches[woman + k] == 1 ? 0 : 1;
            }
            k++;
        }
    }
}
