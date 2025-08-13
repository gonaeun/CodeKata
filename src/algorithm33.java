public class algorithm33 {
    // 약수의 개수와 덧셈

    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            // 약수의 개수가 홀수인지 짝수인지 판별 (완전제곱수면 홀수)
            if(isPerfectSquare(i)) {
                answer -= i; // 홀수면 빼기
            } else {
                answer += i; // 짝수면 더하기
            }
        }
        return answer;
    }

    private boolean isPerfectSquare(int num) {
        // 완전제곱수인지 판별 (완전제곱수 == 약수의 개수가 홀수라는 뜻)
        int sqrt = (int) Math.sqrt(num);  // 제곱근을 구하는 메서드
        return sqrt * sqrt == num;  // 변환한 sqrt 값을 다시 제곱해서 원래 수와 같으면, 완전제곱수
    }

    public static void main(String[] args) {
        // 테스트 출력용
        algorithm33 s = new algorithm33();

        // 테스트 1
        int result1 = s.solution(13, 17);
        System.out.println(result1);

        // 테스트 2
        int result2 = s.solution(24, 27);
        System.out.println(result2);
    }
}
