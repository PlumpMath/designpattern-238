package design.abstractFactory;

/**
 * name: BeatEarphone
 * role : ConcreteProduct
 * description: BeatEarphone
 * Created by bryant on 2017/1/11.
 */
public class BeatEarphone extends  IEarphone{
    @Override
    public void capability() {
        System.out.println("beat耳機");
    }
}
