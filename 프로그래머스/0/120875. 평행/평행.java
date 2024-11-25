public class Solution {
    public int solution(int[][] dots) {
        // 모든 가능한 두 직선 조합의 기울기를 비교
        if (isParallel(dots[0], dots[1], dots[2], dots[3]) ||
            isParallel(dots[0], dots[2], dots[1], dots[3]) ||
            isParallel(dots[0], dots[3], dots[1], dots[2])) {
            return 1;
        }
        return 0;
    }

    // 두 직선이 평행한지 확인하는 함수
    private boolean isParallel(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
        // 첫 번째 직선의 기울기
        double slope1 = getSlope(dot1, dot2);
        // 두 번째 직선의 기울기
        double slope2 = getSlope(dot3, dot4);
        // 두 직선의 기울기가 같으면 평행
        return slope1 == slope2;
    }

    // 두 점 사이의 기울기를 구하는 함수
    private double getSlope(int[] dot1, int[] dot2) {
        if (dot1[0] == dot2[0]) { // x좌표가 같으면 수직선
            return Double.MAX_VALUE; // 무한대 값으로 처리
        }
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }
}