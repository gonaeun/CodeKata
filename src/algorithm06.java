public class algorithm06 {
    // 두 수의 합
    public int solution(int num1, int num2) {
        int answer = num1+num2;
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int answer = new algorithm06().solution(2,3);
        System.out.println(answer);
    }
}
