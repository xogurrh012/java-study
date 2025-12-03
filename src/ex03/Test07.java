package ex03;

// 별찍기
//*****
//****
//***
//**
//*

//ctrl+d = 현재 줄 복사


public class Test07 {
    public static void main(String[] args) {
        //*

        String star = "*";

        int c =5;
        int row = 5;

        for (int k = 0; k < row; k++) {

            for (int i = 0; i < c; i++) {
                System.out.print(star); // ctrl+d
            }
            System.out.println();
            c--;
        }



    }
}
