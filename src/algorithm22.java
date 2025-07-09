public class algorithm22 {
    // 두 정수 사이의 합

    public long solution(int a, int b) {
        long answer = 0;
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        long result1 = new algorithm22().solution(3,5);
        long result2 = new algorithm22().solution(3,3);
        long result3 = new algorithm22().solution(5,3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
