class Solution {
    
    private static int width;
    private static int maxHeight;
    private static int maxHeightCol;
    private static int targetCol;
    
    public int solution(int n, int w, int num) {
        width = w;
        
        // 몇 층(row)인지 확인!! (최대, 타겟 넘버)
        maxHeight = findHeight(n);
        int targetHeight = findHeight(num); 
        // 몇번 col인지 check~~
        maxHeightCol = findCol(maxHeight, n);
        targetCol = findCol(targetHeight, num);
        
        // 꼭대기에 박스 있는지 확인~~~
        if (isBoxOnTargetCol()) {
            return maxHeight - targetHeight + 1;
        } else {
            return maxHeight - targetHeight;
        }
    }
    
    private static int findHeight(int n) {
        return n % width == 0 ? n / width : n / width + 1;
    }
    
    private static int findCol(int height, int target) {
        if (height % 2 == 0) {
            // 홀수 층인 경우 (오른쪽에서 왼쪽으로~~)
            return target % width == 0 ? target % width : width - (target % width);
        } else {
            // 홀수 층인 경우 (왼쪽에서 오른쪽으로~~)
            return target % width == 0 ? width - 1 : target % width - 1;
        }
    }
    
    private static boolean isBoxOnTargetCol() {
        if (maxHeight % 2 == 0) {
            return targetCol >= maxHeightCol;
        } else {
            return targetCol <= maxHeightCol;
        }
    }
}