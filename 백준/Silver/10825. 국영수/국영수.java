import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students.add(new Student(
                    st.nextToken(),
                    Integer.parseInt(st.nextToken()), // 국
                    Integer.parseInt(st.nextToken()), // 영
                    Integer.parseInt(st.nextToken()) // 수
            ));
        }
        students.sort(Comparator.comparing(Student::getKorean).reversed()
                .thenComparing(Student::getEnglish)
                .thenComparing(Comparator.comparing(Student::getMath).reversed())
                .thenComparing(Student::getName)
        );

        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    static class Student {
        String name;
        int korean;
        int english;
        int math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        public String getName() {
            return name;
        }

        public int getKorean() {
            return korean;
        }

        public int getEnglish() {
            return english;
        }

        public int getMath() {
            return math;
        }
    }
}