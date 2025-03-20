public class algorithm11 {
    // 짝수와 홀수
    public String solution(int num) {
        String answer = "";
        if (num%2==0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        String answer = new algorithm11().solution(3);
        System.out.println(answer);
    }
}
