package ex03;

// 1부터 10까지 더해서 합을 출력하는 프로그래을 만드시오 (힌트 int sum = 0; 변수 만들어서 누적하기)

public class Test03 {
    public static void main(String[] args) {
        int sum = 0; // int sum; 만 적어도 됨

        //누적 (sum++, sum = sum+1)

        for (int i = 1; i < 11 ; i++)
            sum += i;

            System.out.println(sum);
    }
}
