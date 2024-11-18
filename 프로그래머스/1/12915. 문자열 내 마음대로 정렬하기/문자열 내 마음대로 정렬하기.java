import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {

        int[] char_sort = new int[strings.length];
        for (int i = 0; i < char_sort.length; i++) {
            char_sort[i] = strings[i].charAt(n) - 'A';
        }
        ArrayList<String> ans = new ArrayList<>();

        Arrays.sort(char_sort);
        Arrays.sort(strings);
        for (int i = 0; i < char_sort.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if ((char)(char_sort[i] + 65) == strings[j].charAt(n)) {
                    if (!ans.contains(strings[j])) {
                        ans.add(strings[j]);
                        break;
                    }
                    
                }
            }
        }

        String[] answer = new String[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            answer[k] = ans.get(k);
        }

        return answer;
    }
}