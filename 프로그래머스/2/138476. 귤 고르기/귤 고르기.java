import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // knapsack 문제?
        // k개를 고르는데, 서로 다른 종류의 수를 최소화 -> 같은 종류 많이
        // k개보다 많이있으면 덜어서 가능!
        // 배열의 낭비를 줄이면서 갯수별로 카운팅 하는법이라....
        Map<Integer, Integer> map = new HashMap<>(tangerine.length);
        
        for (int taste : tangerine) {
            map.put(taste, map.getOrDefault(taste, 0) + 1);
        }
        
        List<Integer> tastelist = new ArrayList<>();
        
        for (int key : map.keySet()) {
            tastelist.add(map.get(key));
        }
        tastelist.sort(Comparator.reverseOrder());
        
        int count = 0;
        int amount = 0;
        int index = 0;
        
        while (amount < k) {
            amount += tastelist.get(index++);
            count += 1;
        }

        return count;
    }
}