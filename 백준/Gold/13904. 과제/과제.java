import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
	
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int maxDay = 0;
		
		List<Integer[]> works = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer[] next =new Integer[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			if (next[0] > maxDay) {
				maxDay = next[0];
			}
			works.add(next);	
		}
		
		works.sort(new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				if (o1[1] == o2[1]) {
					return o2[0] - o1[0];
				} 
				return o2[1] - o1[1];
			}
			
		});
		
		int[] doHw = new int[maxDay+1];
		
		for (Integer[] hw : works) {
			if (doHw[hw[0]] == 0) {
				doHw[hw[0]] = hw[1];
				continue;
			}
			for (int j = hw[0] - 1; j >= 1; j--) {
				if (doHw[j] == 0) {
					doHw[j] = hw[1];
					break;
				}
			}
		}
		int ans = 0;
		for (int i = 1; i <= maxDay; i++) {
			ans += doHw[i];
		}
		System.out.println(ans);
		
	}
}
