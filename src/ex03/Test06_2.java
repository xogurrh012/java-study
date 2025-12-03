package ex03;

public class Test06_2 {
    public static void main(String[] args) {

        String space = " ";
        String star = "*";
        int row = 10;
        int n1 = row-1;
        int n2 = 1;

        for (int k = 0; k < row; k++) {
            for (int i = 0; i < n1; i++) {
                System.out.print(space);
            }
            for (int i = 0; i < n2; i++) {
                System.out.print(star);
            }
            System.out.println();
            n1--;
            n2++;
        }
    }
}
