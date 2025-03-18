public class algorithm02 {
    // 두 수의 곱
    public int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int answer = new algorithm02().solution(3,4);
        System.out.println(answer);
    }
}
