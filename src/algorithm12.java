public class algorithm12 {
    // 평균 구하기
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int s : arr) {
            sum += s;
        }  // 향상된 for문 사용 : 배열arr의 각요소 s를 sum에 더한다!
        answer = (double) sum / arr.length;   // 명시적 형변환 필요해!
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int[] arr = {1,2,3,4};
        double answer = new algorithm12().solution(arr);
        System.out.println(answer);
    }
}
