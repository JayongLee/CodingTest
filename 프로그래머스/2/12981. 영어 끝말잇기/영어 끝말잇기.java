import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {

        /// 끝말잇기를 계속 진행해 나가다 보면,
        /// 3번 사람이 자신의 세 번째 차례에 말한 tank 라는 단어는 이전에 등장했던 단어이므로 탈락하게 됩니다.
        /// 사람의 수 n과 사람들이 순서대로 말한 단어 words 가 매개변수로 주어질 때,
        /// 가장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지를 구해서
        /// return 하도록 solution 함수를 완성해주세요.

        HashSet<String> words_set = new HashSet<>();

        int[] answer = {0, 0};
        char last = words[0].charAt(0);

        for (int i = 0; i < words.length; i++) {

            // "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"

            if (words_set.contains(words[i]) || last != words[i].charAt(0)) {
                answer[0] = (i + 1) % n == 0 ? n : (i + 1) % n;
                answer[1] = (i + 1) % n == 0 ? (i + 1) / n : (i + 1) / n + 1;
                return answer;
            }

            words_set.add(words[i]);
            last = words[i].charAt(words[i].length() - 1);
        }
        
        return answer;
    }
}