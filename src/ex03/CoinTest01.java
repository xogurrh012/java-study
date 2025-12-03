package ex03;

// 동전 종류 : 500, 100, 50 ,10 4가지 종류
// money를 입력 받아서 각각의 동전의 최소 개수를 구할 예정


public class CoinTest01 {
    public static void main(String[] args) {
        int money = 1270;
        int count;
        int restmoney = money;
        int cm;
        int[] moneys = {500, 100, 50, 10};
        int i = -1;

            // 1. 500원으로 나눠서 개수를 구할거다.
            i++;
            cm = moneys[i];
            count = money / cm; //2
            restmoney = money % cm; //270
            System.out.println(cm + "원 개수 : " + count);
            System.out.println("남은금액은 : " + restmoney);

            // 2. 100원으로 나눠서 개수를 구할거다.
            i++;
            cm = moneys[i];
            count = restmoney / cm;
            restmoney = restmoney % cm;
            System.out.println(cm + "원 개수 : " + count);
            System.out.println("남은금액은 : " + restmoney);

            // 3. 50원으로 나눠서 개수를 구할거다.
            i++;
            cm = moneys[i];
            count = restmoney / cm;
            restmoney = restmoney % cm;
            System.out.println(cm + "원 개수 : " + count);
            System.out.println("남은금액은 : " + restmoney);

            // 4. 10원으로 나눠서 개수를 구할거다.
            i++;
            cm = moneys[i];
            count = restmoney / cm;
            restmoney = restmoney % cm;
            System.out.println("10원 개수 : " + count);
            System.out.println("남은금액은 : " + restmoney);

    }
}
