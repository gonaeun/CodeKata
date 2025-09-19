import java.util.Scanner;

public class algorithm38 {
    // 직사각형 별 찍기
    // 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력
    // n,m은 1000 이하의 자연수

    public static void main(String[] args) {
        // 입력 받기 (2번)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        // 별 찍기
        // m개의 줄마다
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                System.out.print("*");  //행(n)개수만큼 별을 찍고
            }
            System.out.println(); // 줄 바꿈
        }

    }

}