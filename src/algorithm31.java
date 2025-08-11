public class algorithm31 {
    // 수박수박수

    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer.append("수");
            } else {
                answer.append("박");
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        // 테스트 출력용
        algorithm31 s = new algorithm31();

        System.out.println(s.solution(3)); // 출력: 수박수
        System.out.println(s.solution(4)); // 출력: 수박수박
    }
}
