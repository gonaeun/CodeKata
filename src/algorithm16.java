import java.util.Arrays;
// java에서 배열을 출력할 때 배열의 참조값을 출력하게 되므로, Arrays.toString()을 통해 배열의 요소를 문자열로 변환하여 출력

public class algorithm16 {
    // x민큼 간격이 있는 n개의 숫자

    public long[] solution(int x, int n) {
        long[] answer = new long[n]; // 배열을 사용하려면 초기화, 배열의 크기 n으로 정의
        for (int i=0; i<n; i++) {
            // i를 배열의 인덱스로 잡고, 배열의 인덱스에 값을 할당하기
            if(i == 0) {   // i=0 이라고 적었다가 오류남
                answer[0] = x;
            } else {
                answer[i] = answer[i-1] + x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        long[] result1 = new algorithm16().solution(4,3);
        System.out.println(result1);  // 예시: Arrays.toString 없으면 배열의 참조값으로 출력됨
        System.out.println(Arrays.toString(result1));
        long[] result2 = new algorithm16().solution(-4,2);
        System.out.println(Arrays.toString(result2));
    }

}
