public class algorithm32 {
    // 내적

    public int solution(int[] a, int[] b) {
        int answer = 0; // for문 밖에서 0으로 초기화
        for(int i=0; i<a.length; i++) {
            answer += a[i]*b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        algorithm32 s = new algorithm32();

        // 테스트 1
        int[] a1 = {1, 2, 3, 4};
        int[] b1 = {-3, -1, 0, 2};
        System.out.println(s.solution(a1, b1));

        // 테스트 2
        int[] a2 = {-1, 0, 1};
        int[] b2 = {1, 0, -1};
        System.out.println(s.solution(a2, b2));
    }
}
