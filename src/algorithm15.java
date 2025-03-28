public class algorithm15 {
    // 자릿수 더하기

    public int solution(int n) {
        int answer = 0;
        for(int i=n; i>0; i--) {
            if (n % i == 1) {
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int result1 = new algorithm15().solution(10);
        System.out.println(result1);
        int result2 = new algorithm15().solution(12);
        System.out.println(result2);
    }

}
