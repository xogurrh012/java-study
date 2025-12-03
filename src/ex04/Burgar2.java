package ex04;

/***
 * 새우버거,불고기버거,치킨버거
 * 빵,양상추 고정 패티변경
 * 3500 4000 4500
 */

import java.util.Scanner;

public class Burgar2 {
    public static void main(String[] args) {
        System.out.println("패티를 선택하세요");
        System.out.println("1.새우 2.불고기 3. 치킨");
        Scanner sc = new Scanner();
        int a = sc.nextInt();

        if (a == 1) {
            a = "새우";
        }

        if (a == 2) {
            a = "불고기";
        }

        if (a == 3) {
            a = "치킨";
        }

        System.out.println(a);
    }
}
