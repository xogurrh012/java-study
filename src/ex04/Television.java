package ex04;

public class Television {
    int channel; // 채널번호
    int volume; // 볼륨
    boolean onOff; // 전원 상태

public static void main(String[] args) {
    Television myTV = new Television();
    myTV.channel = 7;
    myTV.volume = 10;
    myTV.onOff = true;

    Television yourTv = new Television();
    yourTv.channel = 9;
    yourTv.volume = 12;
    yourTv.onOff = true;
    System.out.println("나의 텔레비전의 채널은 "+myTV.channel+"이고 볼륨은 "+myTV.volume+"입니다.");
    System.out.println("너의 텔레비전의 채널은 "+yourTv.channel+"이고 볼륨은 "+yourTv.volume+"입니다.");
    }
}