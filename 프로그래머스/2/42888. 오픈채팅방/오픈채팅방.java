import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String[] solution(String[] record) {
        String[][] history = new String[record.length][2];
        HashMap<String, String> nicknameMap = new HashMap<>();
        for (int i = 0; i < record.length; i++) {
            String[] parse = record[i].split(" ");
            System.out.println(parse.length);
            history[i][0] = parse[1]; // id : uid1234
            history[i][1] = parse[0]; // Enter or Leave
            if (parse[0].equals("Leave")) {
                continue;
            }
            nicknameMap.put(parse[1], parse[2]);
        }
        List<String> answer = new ArrayList<>();
        for (String[] msg : history) {
            if (msg[1].equals("Enter")) {
                answer.add(nicknameMap.get(msg[0]) + "님이 들어왔습니다.");
            } else if (msg[1].equals("Leave")) {
                answer.add(nicknameMap.get(msg[0]) + "님이 나갔습니다.");
            }
        }
        return answer.toArray(new String[0]);
    }
}