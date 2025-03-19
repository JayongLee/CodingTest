class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for (int k : num_list) {
            answer[0] += k % 2 == 0 ? 1 : 0;
            answer[1] += k % 2 == 0 ? 0 : 1;
        }
        return answer;
    }
}