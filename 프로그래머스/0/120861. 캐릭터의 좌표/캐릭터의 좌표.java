import java.util.*;
class Solution {
    
    private static HashMap<String, Integer> dx;
    private static HashMap<String, Integer> dy;
    private static int nowX, nowY;
    private static int maxWidth, maxHeight;

    public int[] solution(String[] keyinput, int[] board) {
        initDx();
        initDy();
        nowX = 0; nowY = 0;
        maxWidth = board[0] / 2;
        maxHeight = board[1] / 2;
        
        for (String direction : keyinput) {
            if (canMove(direction)) {
                nowX = nowX + dx.get(direction);
                nowY = nowY + dy.get(direction);
            }
        }
        
        int[] answer = {nowX, nowY};
        return answer;
    }
    
    private static boolean canMove(String direction) {
        if (direction.equals("left")) {
            return nowX - 1 >= -1 * maxWidth; 
        } else if (direction.equals("right")) {
            return nowX + 1 <= maxWidth;
        } else if (direction.equals("up")) {
            return nowY + 1 <= maxHeight;
        } else {
            return nowY - 1 >= -1 * maxHeight;
        }
    }
    
    private static void initDx() {
        dx = new HashMap<>();
        dx.put("left", -1);
        dx.put("right", 1);
        dx.put("up", 0);
        dx.put("down", 0);
    }
    
        private static void initDy() {
        dy = new HashMap<>();
        dy.put("left", 0);
        dy.put("right", 0);
        dy.put("up", 1);
        dy.put("down", -1);
    }
}