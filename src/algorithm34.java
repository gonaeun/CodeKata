import java.util.Arrays;
import java.util.Collections;

public class algorithm34 {
    // 문자열 내림차순으로 배치하기

    public String solution(String s) {
        // 1. 문자열을 Character 배열로 변환
        Character[] arr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        // 2. 내림차순으로 정렬 (대문자가 뒤로 가도록)
        Arrays.sort(arr, Collections.reverseOrder());

        // 3. 다시 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // 테스트 출력용
        algorithm34 s = new algorithm34();
        System.out.println(s.solution("Zbcdefg"));
    }
}