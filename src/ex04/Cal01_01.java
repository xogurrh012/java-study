package ex04;

import java.util.Scanner;

public class Cal01_01 {



    static void add(int a,int b){
        System.out.println("a+b="+(a+b));
    }

    static void minus(int a, int b){
        System.out.println("a-b+="+(a-b));
    }

    static void multi(int a, int b){
        System.out.println("a*b="+(a*b));
    }

    static void divide(int a, int b){
        System.out.println("a/b="+(a/b));
    }

    //-add(+), minus(-), multi(*), divide(/) 완성해보기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 값을 입력하세요: ");
        int a = sc.nextInt();

        System.out.println("두번째 값을 입력하세요: ");
        int b = sc.nextInt();

     add(a, b);
     minus(a, b);
     multi(a, b);
     divide(a, b);
    }
}
