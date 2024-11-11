import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {

        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int correct_1 = 0;
        int correct_2 = 0;
        int correct_3 = 0;

        for (int i = 0; i < answers.length; i++) {
            int index1 = i % supo1.length;
            int index2 = i % supo2.length;
            int index3 = i % supo3.length;

            if (answers[i] == supo1[index1]) {
                correct_1 += 1;
            }
            if (answers[i] == supo2[index2]) {
                correct_2 += 1;
            }
            if (answers[i] == supo3[index3]) {
                correct_3 += 1;
            }
        }

        int max_correct = Math.max(Math.max(correct_1, correct_2), correct_3);

        ArrayList<Integer> answer_arr = new ArrayList<>();

        if (max_correct == correct_1) {
            answer_arr.add(1);
        }
        if (max_correct == correct_2) {
            answer_arr.add(2);
        }
        if (max_correct == correct_3) {
            answer_arr.add(3);
        }

        int[] answer = new int[answer_arr.size()];
        for (int i = 0; i < answer_arr.size(); i++){
            answer[i] = answer_arr.get(i);
        }

        return answer;
    }
}