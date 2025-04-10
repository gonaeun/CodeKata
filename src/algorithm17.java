import java.util.Arrays;

public class algorithm17 {
    // 자연수 뒤집어 배열로 만들기

    public int[] solution(long n) {
        String str = Long.toString(n); // 1. 숫자를 문자열로 변환
        int len = str.length();
        int[] answer = new int[len];  // 2. 배열의 길이 = 문자열 길이
        for(int i = 0; i < len; i++) {
            answer[i] = str.charAt(len-i-1) -'0'; // 3. 뒤에서부터 하나씩 int로 만들어서 변환 & 자리 뒤집기
            // char - '0'은  char을 int로 변환하는 방식
            // 예) 문자 '5'의 ASCII 코드 값은 53, '0'의 ASCII 값은 48이므로 '5'-'0' = 53 - 48 = 숫자 5
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int[] result1 = new algorithm17().solution(12345);
        System.out.println(result1);  // 예시: Arrays.toString 없으면 배열의 참조값으로 출력됨
        System.out.println(Arrays.toString(result1));
    }

}
