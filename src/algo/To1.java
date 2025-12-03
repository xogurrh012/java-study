package algo;

/**
 * 1~100까지의 수에서 2의 배수를 출력하시오.
 * (1) 비지니스
 * (2) 샘플링
 * (3) 노가다
 * (4) 패턴
 */

public class To1 {
    public static void main(String[] args) {

        int num = 0;
        String result;

        for (int i = 0; i < 100; i++) {

            if (num % 2 == 0) {
                result = "맞음";
            } else {
                result = "아님";
            }
            System.out.println(num + "는 2의배수" + result);
            num++;
        }

    }
}
