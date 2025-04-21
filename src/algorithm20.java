import java.util.Arrays;

public class algorithm20 {
    // 정수 내림차순으로 배치하기

    public long solution(long n) {
        // 1. long n을 문자열로 바꾸기
        String str = String.valueOf(n);
        // 2. 문자열을 문자배열로 변환
        char[] arr = str.toCharArray();
        // 3. 문자배열을 내림차순으로 정렬
        Arrays.sort(arr);  // 오름차순 정렬해서
        StringBuilder sb = new StringBuilder(new String(arr)).reverse(); // 배열 뒤집기
        // 4. 문자열을 다시 long으로 변환해서 반환
        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        // 테스트 출력용
        long result = new algorithm20().solution(118372);
        System.out.println(result);
    }

}
