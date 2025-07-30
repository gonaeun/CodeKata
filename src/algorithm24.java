public class algorithm24 {
    // 서울에서 김서방 찾기

    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        algorithm24 a = new algorithm24();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(a.solution(seoul)); // 출력: 김서방은 1에 있다
    }
}
