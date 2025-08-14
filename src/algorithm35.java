public class algorithm35 {
    // 부족한 금액 계산하기

    public long solution(int price, int money, int count) {
        long total = (long) price * count * (count+1)/2;  // 총 필요한 금액
        long need = total - money; // 부족한 금액
        return need>0 ? need : 0;  // 부족하지 않으면 0 반환
    }

    public static void main(String[] args) {
        // 테스트 출력용
        algorithm35 s = new algorithm35();
        int price = 3;
        int money = 20;
        int count = 4;
        long result = s.solution(price, money, count);
        System.out.println(result);
    }
}