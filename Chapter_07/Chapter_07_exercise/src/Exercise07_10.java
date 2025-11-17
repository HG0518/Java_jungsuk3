public class Exercise07_10 {
    public static void main(String[] args) {
        MyTv2 t=new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}

class MyTv2{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel=0;

    final int MAX_VOLUME=100;
    final int MIN_VOLUME=0;
    final int MAX_CHANNEL=100;
    final int MIN_CHANNEL=1;

    public int getChannel() {
        return channel;
    }

    public int getVolume(){
        return volume;
    }

    public void setChannel(int channel){
        if(channel>MAX_CHANNEL||channel<MIN_CHANNEL){
            System.out.println("잘못된 채널 입력입니다.");
            return;
        }
        prevChannel=this.channel;
        this.channel=channel;
    }

    public void setVolume(int volume){
        if(volume>MAX_VOLUME||volume<MIN_VOLUME){
            System.out.println("잘못된 볼륨 입력입니다.");
            return;
        }
        this.volume=volume;
    }

    public void gotoPrevChannel(){
        if(prevChannel==0){
            System.out.println("이전 채널이 없습니다.");
            return;
        }
        int tmp = this.channel;
        this.channel=prevChannel;
        prevChannel=tmp;
    }
}
