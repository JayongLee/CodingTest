import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> subStrSet = new HashSet<>();
        HashSet<String> ansSet = new HashSet<>();

        String X = br.readLine();
        String Y = br.readLine();
        String Z = br.readLine();
        int k = Integer.parseInt(br.readLine());

        String[] test = {X, Y, Z};
        for (String t : test) {
            for (String sub : findSubStr(t.toCharArray(), k)) {
                // 두 번 이상 나타난 경우 Set에 저장
                if (subStrSet.contains(sub) && !ansSet.contains(sub)) {
                    ansSet.add(sub);
                }
                else subStrSet.add(sub);
            }
        }
        if (ansSet.isEmpty()) {
            System.out.println(-1);
            return;
        }
        // 오름차순 출력
        ansSet.stream()
                .sorted(Comparator.comparing(String::new))
                .forEach(System.out::println);
    }

    // 부분문자열 모든 경우의 수 찾기
    private static List<String> findSubStr(char[] wordArr, int k) {
        // 재귀 종료 시점
        if (k == 0) return List.of(new String[0]);
        if (k == 1) {
            List<String> subStrList = new ArrayList<>();
            for (char c : wordArr) {
                subStrList.add(String.valueOf(c));
            }
            return subStrList;
        }

        List<String> subStrList = new ArrayList<>();

        // 경우의 수
        for (int i = 0; i + k <= wordArr.length; i++) {
            StringBuilder add = new StringBuilder();
            add.append(wordArr[i]);
            // 이후 문자열에 대해 경우의 수 조사 (재귀)
            List<String> after = findSubStr(Arrays.copyOfRange(wordArr, i+1, wordArr.length), k-1);
            for (String rest : after) {
                String tmp = add + rest;
                subStrList.add(tmp);
            }
        }
        return subStrList;
    }
}
