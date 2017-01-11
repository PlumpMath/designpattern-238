package design.abstractFactory;

/**
 * name: CDPlayer
 * role : ConcreteProduct
 * description:CD 播放器
 * Created by bryant on 2017/1/11.
 */
public class CDPlayer extends  IPlayer {
    @Override
    public void play() {
        System.out.print("CD Player");
    }

}
