package design.adapter;

/**
 *  name: AdapterComposition.java
 * description:  組合式變壓器
 * Created by bryant on 2017/1/24.
 */
public class AdapterComposition implements  IAdapter{
    private   Adaptee adaptee  = new Adaptee();

    @Override
    public float convertVolt(float rate) {
        return adaptee.getVolt().getV()*rate;
    }
}
