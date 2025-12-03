package ex04;

public class Tv01 {

    boolean stauts = false; // 상태

    void on() {
        System.out.println("tv가 켜졌어요");
        stauts = true; // 상태변경
    }

    void off(){
        System.out.println("tv가 꺼졌어요");
        stauts = false;
    }

    public static void main(String[] args) {
        Tv01 tv = new Tv01(); // 객체(Object) 생성
        System.out.println(tv.stauts);

        tv.on();
        System.out.println(tv.stauts); // 상태는 꼭 행위를 통해 변경해야함

    }
}
