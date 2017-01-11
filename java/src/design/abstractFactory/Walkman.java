package design.abstractFactory;

/**
 * name: Walkman
 * role : ConcreteFactory
 * description: 具體工廠角色->產品功能CD、Stereo
 * Created by bryant on 2017/1/11.
 */
public class Walkman extends IProductFactory {
    @Override
    public IPlayer createPlayer() {
        return new CDPlayer();
    }

    @Override
    public IEarphone createEarphone() {
        return new StereoEarphone();
    }
}
