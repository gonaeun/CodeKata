public class algorithm27 {
    // 핸드폰 번호 가리기

    public String solution(String phone_number) {
        int length = phone_number.length(); // 전체 길이
        String stars = "*".repeat(length - 4); // 전체 길이에서 4자리 제외하고 *반복
        String last4 = phone_number.substring(length - 4); // 마지막 4자리 추출
        return stars + last4; // *과 마지막4자리 이어붙여 반환
    }

    public static void main(String[] args) {
        // 테스트 출력용

        algorithm27 a = new algorithm27();

        String phone1 = "01033334444";
        System.out.println("결과 1: " + a.solution(phone1)); // 출력: *******4444

        String phone2 = "027778888";
        System.out.println("결과 2: " + a.solution(phone2)); // 출력: *****8888
    }
}
