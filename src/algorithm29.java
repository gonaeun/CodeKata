import java.util.Arrays;

public class algorithm29 {
    // 제일 작은 수 제거하기
    // 정수 배열에서 가장 작은 수 하나를 제거한 배열 리턴
    // 단, 배열 길이가 1이라면 [-1] 리턴

    public int[] solution(int[] arr) {

        // 배열 길이가 1일 때
        if (arr.length == 1) {
            return new int[] {-1};
        }

        // 최소값 찾기
        int min = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 최소값을 제외한 새 배열 만들기
        int[] answer = new int[arr.length -1];
        int idx = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != min) {
                answer[idx++] = arr[i];
            }

        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        algorithm29 a = new algorithm29();

        int[] test1 = {4, 3, 2, 1};
        int[] test2 = {10};
        System.out.println("출력: " + Arrays.toString(a.solution(test1)));  // [4, 3, 2]
        System.out.println("출력: " + Arrays.toString(a.solution(test2)));  // [-1]
    }
}
