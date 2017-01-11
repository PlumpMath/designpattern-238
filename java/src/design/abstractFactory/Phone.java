package design.abstractFactory;

/**
 * name: Phone
 * role : ConcreteFactory
 * description: 具體工廠角色->手機功能MP3、beat耳機
 * Created by bryant on 2017/1/11.
 */
public class Phone extends  IProductFactory {

    @Override
    public IPlayer createPlayer() {
        return new MP3Player();
    }

    @Override
    public IEarphone createEarphone() {
        return new BeatEarphone();
    }
}
