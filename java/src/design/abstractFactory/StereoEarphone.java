package design.abstractFactory;

/**
 * name: StereoEarphone
 * role : ConcreteProduct
 * description: StereoEarphone
 * Created by bryant on 2017/1/11.
 */
public class StereoEarphone extends  IEarphone{
    @Override
    public void capability() {
        System.out.println("立體聲耳機");
    }
}
