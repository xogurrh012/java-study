package algo;

public class To1_01 {
    public static void main(String[] args) {

        int num = 0;
        String result;

        for (int i = 0; i < 100; i++) {

            if (num % 2 == 0) {
                result = "맞음";
                System.out.println(num+"는 2의배수");
            } else {
                result = "아님";
            }
            num++;
        }

    }
}

