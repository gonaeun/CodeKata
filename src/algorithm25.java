import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class algorithm25 {
    // 나누어 떨어지는 숫자 배열

    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();  // 나누어 떨어지는 값들(정수)만 리스트로 저장

        for (int num : arr) { // 배열 arr의 각 원소 num에 대해 반복
            if (num % divisor == 0) {
                result.add(num);
            }
        }

        if (result.isEmpty()) { // 나누어떨어지는 수가 하나도 없다면
            return new int[]{-1}; // -1을 원소로 갖는 배열을 리턴
        }

        Collections.sort(result); // 오름차순 정렬

        // 결과 리스트의 크기만큼 정수 배열 answer를 생성
        int[] answer = new int[result.size()];

        // 리스트의 값을 배열로 복사
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i); // i번째 값을 배열에 넣음
        }

        // 결과 배열 반환
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용

        algorithm25 a = new algorithm25();
        int[] arr1 = {5, 9, 7, 10};
        int divisor1 = 5;
        System.out.println(Arrays.toString(a.solution(arr1, divisor1))); // [5, 10]

        int[] arr2 = {2, 36, 1, 3};
        int divisor2 = 1;
        System.out.println(Arrays.toString(a.solution(arr2, divisor2))); // [1, 2, 3, 36]

        int[] arr3 = {3, 2, 6};
        int divisor3 = 10;
        System.out.println(Arrays.toString(a.solution(arr3, divisor3))); // [-1]
    }
}
