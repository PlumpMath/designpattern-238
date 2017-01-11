package design.abstractFactory;

/**
 * name: MP3Player
 * role : ConcreteProduct
 * description:MP3 播放器
 * Created by bryant on 2017/1/11.
 */
public class MP3Player extends  IPlayer {
    @Override
    public void play() {
        System.out.print("MP3 Player");
    }
}
