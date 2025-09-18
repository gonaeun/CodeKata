import java.util.Arrays;

public class algorithm37 {
    // 행렬의 덧셈

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;           // 행의 개수
        int cols = arr1[0].length;        // 열의 개수
        
        int[][] answer = new int[rows][cols]; // 결과 행렬 초기화
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
                // 같은 행열 자리에 있는 두 수를 알아서 더하는데, 틀을 맞춰준거구나
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        algorithm37 s = new algorithm37();

        // 입력값
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};

        // 메서드 실행
        int[][] result = s.solution(arr1, arr2);

        
        // 결과 출력 (배열 형태 그대로 출력)
        System.out.println(Arrays.deepToString(result));
    }
}