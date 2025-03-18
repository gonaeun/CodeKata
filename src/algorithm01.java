public class algorithm01 {
    // 두 수의 차
    public int solution(int num1, int num2) {
        int answer = num1-num2;
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int answer = new algorithm01().solution(100,2);
        System.out.println(answer);
    }
}
