public class algorithm04 {
    // 나이 출력
    public int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int answer = new algorithm04().solution(40);
        System.out.println(answer);
    }
}
