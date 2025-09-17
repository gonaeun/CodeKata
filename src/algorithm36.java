public class algorithm36 {
    // 문자열 다루기 기본

    // 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수
    // 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴
    // 제한 사항
    // s는 길이 1 이상, 길이 8 이하인 문자열입니다.
    // s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.

    public boolean solution(String s) {
        boolean answer = true;
        // s의 길이가 4 혹은 6인지 확인
        if(s.length() == 4 || s.length() == 6) {
            // s가 숫자로만 구성되어있는지 확인
            for(int i=0; i<s.length(); i++){
                if (!Character.isDigit(s.charAt(i))) {
                    answer = false;
                }
            }    
        }
        else {
            answer = false;
        }
        return answer;
    }   

    public static void main(String[] args) {
        // 테스트 출력용
        algorithm36 s = new algorithm36();
        String str1 = "a234";
        boolean result = s.solution(str1);
        System.out.println(result);
        String str2 = "1234567";
        boolean result2 = s.solution(str2);
        System.out.println(result2);
        String str3 = "123456";
        boolean result3 = s.solution(str3);  
        System.out.println(result3);
    }
}