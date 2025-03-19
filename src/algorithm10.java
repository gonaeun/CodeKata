public class algorithm10 {
    // 배열의 평균값
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        answer = sum / (double) numbers.length;
        // int형끼리 계산하면 정수가 나오므로, 하나라도 double로 명시적 형변환을 해주어야 실수형 답을 얻을 수 있음
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        double answer = new algorithm10().solution(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(answer);
    }
}
