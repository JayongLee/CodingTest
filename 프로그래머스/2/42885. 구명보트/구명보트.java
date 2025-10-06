import java.util.*;

class Solution {
    private static boolean[] moved;
    public int solution(int[] people, int limit) {
        // 2명씩 무게 제한
        // 젤 무거운 사람 + 젤 가벼운 사람
        moved = new boolean[people.length];
        Arrays.sort(people);
        
        int answer = 0;
        int heavy = people.length - 1;
        int light = 0;
        while (light <= heavy) {
            // 무거운 사람은 고정
            // 무거운 사람 + 가벼운 사람 가능?
            if (people[heavy] + people[light] <= limit) {
                light++; // 가벼운 사람 태움
            }
            heavy--; // 무거운 사람 태움
            answer++; // 배 출발
        }
        return answer;
    }
}