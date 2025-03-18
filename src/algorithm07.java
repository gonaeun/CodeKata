public class algorithm07 {
    // 두 수의 나눗셈
    public int solution(double num1, double num2) {
        double answer1 = num1/num2;
        int answer = (int)(answer1 * 1000);
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int answer = new algorithm07().solution(3,2);
        System.out.println(answer);
    }
}
