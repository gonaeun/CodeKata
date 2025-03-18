public class algorithm03 {
    // 몫 구하기
    public int solution(int num1, int num2) {
        int answer = num1/num2;
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int answer = new algorithm03().solution(7,2);
        System.out.println(answer);
    }
}
