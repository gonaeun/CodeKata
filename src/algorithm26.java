import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class algorithm26 {
    // 음양 더하기

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i<absolutes.length; i++) {
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용

        algorithm26 a = new algorithm26();
        int[] absolutes1 = {4, 7, 12};
        boolean[] signs1 = {true, false, true};
        System.out.println(a.solution(absolutes1, signs1)); // 출력: 9

        int[] absolutes2 = {1, 2, 3};
        boolean[] signs2 = {false, false, true};
        System.out.println(a.solution(absolutes2, signs2)); // 출력: 0
    }
}
