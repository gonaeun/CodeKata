import java.util.Arrays;

public class algorithm21 {
    // 하샤드 수

    public boolean solution(int x) {
        boolean answer = true;
        String sum = Integer.toString(x); // 문자열로 변환
        int sum_x = 0; // 자릿수들의 합을 저장할 변수
        for (int i = 0; i < sum.length(); i++) {
            sum_x += sum.charAt(i)-'0';  // charAt()으로 문자를 하나씩 꺼내서, -48로 문자를 숫자로 변환, 그 자릿수들을 모두 sum
        }
        if (x % sum_x == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        boolean answer = new algorithm21().solution(10);
        System.out.println(answer);
        boolean answer2 = new algorithm21().solution(12);
        System.out.println(answer2);
        boolean answer3 = new algorithm21().solution(11);
        System.out.println(answer3);
        boolean answer4 = new algorithm21().solution(13);
        System.out.println(answer4);
    }

}
