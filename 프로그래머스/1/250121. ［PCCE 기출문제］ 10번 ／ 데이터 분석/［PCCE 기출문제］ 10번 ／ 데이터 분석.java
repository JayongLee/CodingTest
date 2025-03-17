import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        /// data 에서 ext 값이 val_ext 보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순으로 정렬
        /// ext 와 sort_by의 값은 다음 중 한 가지를 가집니다.
        /// "code", "date", "maximum", "remain"

        int ext_index = switch (ext) {
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        int sort_by_index = switch (sort_by) {
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> 0;
        };

        TreeMap<Integer, int[]> answer_map = new TreeMap<>();
        ArrayList<Integer> index_array = new ArrayList<>();

        for (int[] data_i : data) {
            if (data_i[ext_index] < val_ext) {
                answer_map.put(data_i[sort_by_index], data_i);
                index_array.add(data_i[sort_by_index]);
            }
        }

        int[][] answer = new int[answer_map.size()][4];
        index_array.sort(null);

        for (int i = 0; i < answer_map.size(); i++) {
            answer[i] = answer_map.get(index_array.get(i));
        }

        return answer;
    }
}