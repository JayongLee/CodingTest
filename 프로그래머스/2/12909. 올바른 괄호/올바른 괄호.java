import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.add(chars[i]);
                continue;
            }
            if (chars[i] == ')') {
                if (stack.isEmpty() || !stack.pop().equals('(')) {
                    answer = false;
                }
            }
        }
        
        if (!stack.isEmpty()) answer = false;

        return answer;
    }
}