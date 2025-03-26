public class algorithm13 {
    // 자릿수 더하기

    public int solution(int n) {
        String numberString = Integer.toString(n); // 정수 n을 문자로 변환
        int sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            sum += Character.getNumericValue(numberString.charAt(i));
            // charAt(i); i번째 위치에 있는 문자를 반환
            // Character.getNumericValue(); 문자에 해당하는 숫자로 변환
        }
        return sum;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        int result = new algorithm13().solution(123);
        System.out.println(result);
    }

}
