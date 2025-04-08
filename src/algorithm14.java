public class algorithm14 {
    // 약수의 합

    public int solution(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            if (n%i == 0) { // i가 n의 약수인지 확인
                sum +=i;  // 약수이면 더해라
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int result = new algorithm14().solution(12);
        System.out.println(result);
    }

}
