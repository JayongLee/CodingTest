import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> count = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            String runner = participant[i];
            count.put(runner, count.getOrDefault(runner, 0) + 1);
        }

        for (int j = 0; j < completion.length; j++) {
            int update = count.get(completion[j]) - 1;
            count.put(completion[j], update);
            if (update == 0) {
                count.remove(completion[j]);
            }
        }

        return count.keySet().iterator().next();
    }
}