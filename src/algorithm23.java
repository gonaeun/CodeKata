public class algorithm23 {
    // 콜라츠 추측

    public int solution(int num) {
        long n = (long) num;  // long으로 형변환 (626331인 경우 오버플로우 방지)

        for (int count = 0; count <500; count++) {
            if (n ==1) return count; // 1이면 횟수 반환

            if (n %2 == 0) {   // 짝수라면
                n = n/2;     // 2로 나누고
            } else {             // 홀수라면
                n = n*3 +1;  // 3 곱하고 1 더하기
            }
        }

        return -1;  // 500번 넘도록 1 안되면 -1 반환
    }

    public static void main(String[] args) {
        // 테스트 출력용
        long result1 = new algorithm23().solution(6);
        long result2 = new algorithm23().solution(16);
        long result3 = new algorithm23().solution(626331);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
