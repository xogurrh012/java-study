package ex03;

// 별찍기
//*****
//****
//***
//**
//*

public class Test05 {
    public static void main(String[] args) {

        int a = 0;

        for (int j = 0; j < 5; j++) {
            a++;
            for (int i = 6; i > a ; i--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
