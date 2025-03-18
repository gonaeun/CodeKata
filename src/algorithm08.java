public class algorithm08 {
    // 각도기
    public int solution(int angle) {
        int answer = 0;  // 이렇게 지역변수로 선언할 땐 초기화 해줘야 컴파일에러 안 뜸
        if (angle > 0 && angle < 90){
            answer = 1;
        } else if (angle == 90){
            answer = 2;
        } else if (angle > 90 && angle < 180){
            answer = 3;
        } else if (angle == 180){
            answer = 4;
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int answer = new algorithm08().solution(70);
        System.out.println(answer);
    }
}
