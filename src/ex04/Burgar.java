package ex04;

public class Burgar {
    String 재료1;
    String 재료2;
    String 재료3;
    int price;

    Burgar(String 재료2, String 재료3, int price){
        this.재료1 = "빵";
        this.재료2 = 재료2;
        this.재료3 = 재료3;
        this.price = price;
    }

    void show(){
        System.out.println(재료3+"버거 "+price+"원");
    }

    public static void main(String[] args) {
    Burgar burgar = new Burgar("양상추","새우",3800);
        burgar.show();
    }
}
