import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> warn = new HashMap<>();
        HashMap<String, Set<String>> reportMap = new HashMap<>();
        for (String s : report) {
            String[] reportArr = s.split(" "); // 0 : 신고자, 1 : 신고 당한 사람
            // 신고한 리스트를 Set으로 저장 ex. "frodo neo"
            Set<String> set = reportMap.getOrDefault(reportArr[0], new HashSet<>());
            set.add(reportArr[1]);
            reportMap.put(reportArr[0], set);
        }
        // warn update
        for (String reporter : reportMap.keySet()) {
            Set<String> reportedIds = reportMap.get(reporter);
            reportedIds.forEach(name ->
                warn.put(name, warn.getOrDefault(name, 0) + 1)
            );
        }
        
        int[] answer = new int[id_list.length];
        
        for (int i = 0; i < id_list.length; i++) {
            if (reportMap.containsKey(id_list[i])) {
                String[] reportList = reportMap.get(id_list[i]).toArray(new String[0]);
                int count = 0;
                for (String name : reportList) {
                    if (warn.get(name) >= k) count++; // error
                }
                answer[i] = count;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
}