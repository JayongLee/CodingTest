import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int[] answer = {};

        String change = s.replace('{', ' ').replace('}', ' ').trim();
        String[] stringSet = change.split(" , ");
        
        Arrays.sort(stringSet, (o1, o2) -> {
            return o1.length() - o2.length();
        });
        
        StringBuilder sb = new StringBuilder();
        List<Integer> ansList = new ArrayList<>();
        
        for (int i = 0; i < stringSet.length; i++) {
            String[] nums = stringSet[i].split(",");
            for (String num : nums) {
                if (ansList.contains(Integer.parseInt(num)))
                    continue;
                ansList.add(Integer.parseInt(num));
            }
        }

        return ansList.stream().mapToInt(i -> i).toArray();
    }
}