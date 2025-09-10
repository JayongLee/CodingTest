import java.util.*;

class Solution {
    public int solution(int[] topping) {
        // n^2으로 풀어보자
        Set<Integer> leftSet = new HashSet<>();
        Set<Integer> rightSet = new HashSet<>();
        HashMap<Integer, Integer> toppingMap = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < topping.length; i++) {
            rightSet.add(topping[i]);
            toppingMap.put(topping[i] ,toppingMap.getOrDefault(topping[i], 0) + 1);
        }
        
        for (int i = 0; i < topping.length; i++) {
            leftSet.add(topping[i]);
            if (toppingMap.get(topping[i]) <= 1) {
                rightSet.remove(topping[i]);
            } else {
                toppingMap.put(topping[i], toppingMap.get(topping[i]) - 1);
            }
            if (leftSet.size() == rightSet.size())
                answer++;
        }

        return answer;
    }
}