class Solution {
    private static int[][] sumdata;
    private static int floorRow;
    
    public int solution(int[][] triangle) {
        floorRow = triangle.length - 1;
        System.out.println("floorRow : " + floorRow);
        sumdata = new int[floorRow + 1][triangle[floorRow].length + 1];
        
        initSumdata(triangle[floorRow]);
        // 위층의 i 인덱스는 아래층의 i, i+1에서 넘어올 수 있다    
        int answer = maxSum(0, 0, triangle);
        return answer;
    }
    
    private static int maxSum(int row, int col, int[][] triangle) {
        if (sumdata[row][col] == 0) {
            sumdata[row][col] = Math.max(maxSum(row + 1, col, triangle), maxSum(row + 1, col + 1, triangle)) 
                + triangle[row][col];
            return sumdata[row][col];
        } else {
            return sumdata[row][col];
        }
    }
    
    private static void initSumdata(int[] initdata) {
        for (int i = 0; i < sumdata[0].length - 1; i++) {
            sumdata[floorRow][i] = initdata[i];
        }
    }
}