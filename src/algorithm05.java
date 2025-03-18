public class algorithm05 {
    // 숫자 비교하기
    public int solution(int num1, int num2) {
        int answer; // 블록 밖에서 변수 선언
        if (num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int answer = new algorithm05().solution(2,3);
        System.out.println(answer);
    }
}
