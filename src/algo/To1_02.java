package algo;

import java.util.Scanner;

public class To1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("확인하고 싶은 배수를 입력하세요");
        int a = sc.nextInt();

        System.out.println("최대 범위를 입력하세요");
        int b = sc.nextInt();

        int num = 1;

        for (int i = 0; i < b; i++) {
            if (num % a == 0) System.out.println(num + "는 " + a + "의배수");

            num++;
        }
    }
}