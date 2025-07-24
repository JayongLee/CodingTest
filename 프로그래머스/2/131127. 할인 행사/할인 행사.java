import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        int answer = 0;
        for (int i = 0; i + 9 < discount.length; i++){
            String[] sale = Arrays.copyOfRange(discount, i, i + 10);
            HashMap<String, Integer> saleMap = new HashMap<>();
            for (int j = 0; j < sale.length; j++) {
                saleMap.put(sale[j], saleMap.getOrDefault(sale[j], 0) + 1);
            }
            if(wantMap.equals(saleMap)) {
                answer++;
            }
        }
        return answer;
    }
}