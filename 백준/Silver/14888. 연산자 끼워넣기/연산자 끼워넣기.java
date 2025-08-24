import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    private static int N;
    private static int[] sequence;
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;
    
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		N = n;
		sequence = new int[n];
		
		// 수열 저장
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			sequence[i] = Integer.parseInt(st.nextToken());
		}
		
		// 연산자 저장
		int[] operator = new int[4];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		backtrack(sequence[0], operator, 1);
		
		// 결과 출
		System.out.println(max);
		System.out.println(min);
	}
	
	private static void backtrack(int before, int[] operator, int seqIdx) {
		if (seqIdx == N) {
			if (max < before) {
				max = before;
			} 
			if (before < min) {
				min = before;
			}
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			if (operator[i] == 0) 
				continue;
			
			int operateResult = doOperate(before, sequence[seqIdx], i);
			int[] copyOperator = operator.clone();
			copyOperator[i]--;
			backtrack(operateResult, copyOperator, seqIdx + 1);
		}
	}

	private static int doOperate(int x, int y, int operatorIdx) {
		switch(operatorIdx) {
			case 0 : {
				return x + y;
			}
			case 1 : {
				return x - y;
			}
			case 2 : {
				return x * y;
			}
			case 3 : {
				return x / y;
			}
		}
		return 0;
	}
}
