package ex03;

public class star2 {
    public static void main(String[] args) {

        int a = 0;

        for (int b = 0; b < 3 ; b++) {
            a++;
            for (int i = 0; i < a ; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
