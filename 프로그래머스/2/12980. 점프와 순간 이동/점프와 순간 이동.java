import java.util.*;

public class Solution {
    
    private static int minCost;
    private static boolean[] isUsed;
    
    public int solution(int n) {
        // k칸 앞으로 점프 or now * 2 순간이동
        // k칸 점프시에만 k만큼 배터리 소모
        // k는 최대 10억 매우크다
        minCost = 100_000_000;
        isUsed = new boolean[n / 2 + 1];
        
        for (int i = 1; i < n / 2; i++) {
            if (isUsed[i] == true || i >= minCost) continue; // 이미 더 적은 값으로 해결
            // n/2까지 모든 경우의 수 계산
            int cost = i;
            int now = i;
            while (now * 2 <= n) {
                now *= 2;
                if (now < n / 2) 
                    isUsed[now] = true;
            }
            System.out.println("i = " + i);
            System.out.println("now = " + now);

            cost += n - now;
            System.out.println("cost = " + cost);
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }
}