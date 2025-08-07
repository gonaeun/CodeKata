import java.util.Arrays;

public class algorithm30 {
    // 가운데 글자 가져오기
    // substring() 사용

    public String solution(String s) {
        int len = s.length();
        if (len % 2 == 0) {
            // 짝수인 경우 : 가운데 두 글자 반환
            return s.substring(len/2 -1, len/2 +1);
        } else {
            // 홀수인 경우 : 가운데 한 글자 반환
            return s.substring(len/2, len/2 +1);
        }
    }

    public static void main(String[] args) {
        // 테스트 출력용
        algorithm30 a = new algorithm30();

        System.out.println(a.solution("abced"));  // [4, 3, 2]
        System.out.println(a.solution("qwer"));  // [-1]
    }
}
