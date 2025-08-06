public class algorithm28 {
    // 없는 숫자 더하기

    public int solution(int[] numbers) {
        int total = 45;
        for (int num : numbers) {
            total -= num;
        }
        return total;
    }

    public static void main(String[] args) {
        // 테스트 출력용
        algorithm28 a = new algorithm28();

        int[] test1 = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] test2 = {5, 8, 4, 0, 6, 7, 9};

        System.out.println(a.solution(test1)); // 14
        System.out.println(a.solution(test2)); // 6
    }
}
