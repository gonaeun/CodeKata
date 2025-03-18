public class algorithm09 {
    // 짝수의 합
    public int solution(int n) {
        int answer = 0;
        int i;
        for (i=1; i<=n; i++) {
            if (i % 2 == 0) {  // while문으로 쓰면 무한루프되니까 if문으로 작성했음
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int answer = new algorithm09().solution(10);
        System.out.println(answer);
    }
}
