import java.util.Arrays;

public class algorithm18 {
    // 문자열을 정수로 바꾸기

    public int solution(String s) {
        return Integer.parseInt(s);
        // Integer.parseInt() : Integer 클래스에 있는 parseInt라는 기능을 호출해서 문자열을 int로 변환해줘!
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int result1 = new algorithm18().solution("12345");
        System.out.println(result1);
        int result2 = new algorithm18().solution("-12345");
        System.out.println(result2);
    }

}
