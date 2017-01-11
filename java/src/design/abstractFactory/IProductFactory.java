package design.abstractFactory;

/**
 * name: IProductFactory
 * role : AbstractFactory
 * description: 產品抽象類別
 * Created by bryant on 2017/1/11.
 */
public abstract class IProductFactory {
    //產生播放器
    public abstract IPlayer  createPlayer();
    //產生耳機
    public  abstract IEarphone createEarphone();
}
