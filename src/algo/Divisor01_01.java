package algo;

import java.util.Scanner;

public class Divisor01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("확인할 약수를 입력하세요");
        int a = sc.nextInt();
        int num = 1;
        String result;

        for (int i = 0; i < a; i++) {
            if (a % num == 0){
                result = "맞음";
                System.out.println(num + "은 약수 " + result);
            }
            num++;
        }
    }
}