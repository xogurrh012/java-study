package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {

    double b;

    Scanner sc = new Scanner(System.in);
    System.out.println("================");
    System.out.println("1. 섭씨 -> 화씨");
    System.out.println("2. 화씨 -> 섭씨");
    System.out.println("================");
    System.out.println("번호를 선택하시오:");
    int choice = sc.nextInt();

    if(choice==1) {
        System.out.println("섭씨온도를 입력하시오: ");
        b = sc.nextDouble();
        double result = b * 1.8 + 32;
        System.out.println("화씨온도는 " + result);
    }

    else if(choice==2) {
        System.out.println("화씨 온도를 입력하시오: ");
        b = sc.nextDouble();
        double result2 = (b - 32) * 0.5555;
        System.out.println("섭씨 온도는 " + result2);

    }
    }
}
