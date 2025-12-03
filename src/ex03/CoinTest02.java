package ex03;

// 동전 종류 : 500, 100, 50 ,10 4가지 종류
// money를 입력 받아서 각각의 동전의 최소 개수를 구할 예정
import java.util.Scanner;

public class CoinTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하세요 :");

        int money = sc.nextInt();
        int count;
        int rastmoney = money;
        int cm;
        int[] moneys = {500,100,50,10};
        int i = -1;

        for (int j = 0; j <4; j++) {
            i++;
            cm = moneys[i];
            count = rastmoney / cm;
            rastmoney = rastmoney % cm;

            System.out.println(cm+"원 갯수 : "+count);
            System.out.println("남은 금액 : "+rastmoney);
        }


    }
}
