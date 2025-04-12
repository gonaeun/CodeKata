public class algorithm19 {
    // 정수 제곱근 판별

    public long solution(long n) {
        long x = 1;     // x는 양의정수니까 1부터 차례대로 증가시켜보자. n이 x의 제곱이라면 x가 더 작은수일거야
        while (x*x <= n) {
            if (x*x == n) {
                return (x+1)*(x+1);
            }
            x++;
        }
        return -1;  // else 구문 대신에 이렇게 적을 수 있음
    }

    public static void main(String[] args) {
        // 테스트 출력용
        long result1 = new algorithm19().solution(121);
        System.out.println(result1);
        long result2 = new algorithm19().solution(3);
        System.out.println(result2);
    }

}
