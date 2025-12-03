package ex03;

// 별찍기 도전문제!!
//      *
//     **
//    ***
//   ****
//  *****


public class TEST06 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        for (int j = 0; j < 5; j++) {
            a++;
            for (int i = 5; i > a; i--) {
                System.out.print(" ");
            }

            b++;
            for (int i = 0; i < b; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}