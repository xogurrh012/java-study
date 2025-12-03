package algo;


import java.util.Scanner;

public class Gcd04_01 {

    static int[] 약수구하기(int a){
        int[] arr1 = new int[a];
        int n1 = 0;
        int k1 = 1;
        for (int i = 0; i < a; i++) {
            if (a % k1 == 0) {
                arr1[n1] = k1;
                n1++;
            }
            k1++;
        }
        return arr1;
    }

    static int 최대공약수구하기(int[] arr1, int[] arr2){
        int result = 0;
        int c = 0;

        for (int i = 0; i < 4; i++) {
            if(arr1[c] == arr2[0]) result = arr1[c];
            if(arr1[c] == arr2[1]) result = arr1[c];
            if(arr1[c] == arr2[2]) result = arr1[c];
            if(arr1[c] == arr2[3]) result = arr1[c];
            c++;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 약수를 입력하세요");
        int a = sc.nextInt();
        int[] arr1 = 약수구하기(a);

        System.out.println("두번째 약수를 입력하세요");
        a = sc.nextInt();
        int[] arr2 = 약수구하기(a);


        int result = 최대공약수구하기(arr1, arr2);

        System.out.println("최대공약수 : "+result);

    }
}
