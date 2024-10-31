class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(n));
        sb.reverse();
        int[] answer = new int[sb.length()];
        String str = sb.toString();
        for (int i = 0; i < sb.length(); i++) {
            System.out.println(str.charAt(i));
            answer[i] = str.charAt(i) - 48;
        }
        return answer;
    }
}