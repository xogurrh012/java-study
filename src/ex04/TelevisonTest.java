package ex04;

    class Televison {
    private int channel;
    private int volume;
    private boolean onOff;

    Televison (int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }
    void print(){
        System.out.println("채널은"+channel+"이고 볼륨은 "+volume+"입니다.");
    }
}
public class TelevisonTest {
    public static void main(String[] args) {
        Televison myTv = new Televison(7, 10, true);
        myTv.print();

        Televison yourTv = new Televison(11, 20, true);
        yourTv.print();
    }
}
