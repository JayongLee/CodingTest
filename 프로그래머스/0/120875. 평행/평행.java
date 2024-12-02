import java.util.HashSet;
import java.util.Set;

class Solution {
    // 기울기를 계산하는 메서드
    public double getSlope(int x1, int y1, int x2, int y2) {
        if (x2 == x1) {
            return Double.POSITIVE_INFINITY; // 수직선인 경우
        }
        return (double) (y2 - y1) / (x2 - x1);
    }

    public int solution(int[][] dots) {
        // 기울기를 저장할 Set
        Set<Double> slopes = new HashSet<>();

        // 각 쌍의 기울기를 계산하고 비교
        double slope12 = getSlope(dots[0][0], dots[0][1], dots[1][0], dots[1][1]);
        double slope34 = getSlope(dots[2][0], dots[2][1], dots[3][0], dots[3][1]);
        if (slope12 == slope34) {
            return 1;
        }

        double slope13 = getSlope(dots[0][0], dots[0][1], dots[2][0], dots[2][1]);
        double slope24 = getSlope(dots[1][0], dots[1][1], dots[3][0], dots[3][1]);
        if (slope13 == slope24) {
            return 1;
        }

        double slope14 = getSlope(dots[0][0], dots[0][1], dots[3][0], dots[3][1]);
        double slope23 = getSlope(dots[1][0], dots[1][1], dots[2][0], dots[2][1]);
        if (slope14 == slope23) {
            return 1;
        }

        return 0;
    }
}