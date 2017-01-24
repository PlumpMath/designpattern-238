package design.adapter;

/**
 *  name: Adapter.java
 * description:  變壓器實作(類別配接器)
 * Created by bryant on 2017/1/24.
 */
public class Adapter extends  Adaptee implements IAdapter {

    @Override
    public float convertVolt( float rate) {
        return getVolt().getV() * rate ;
    }
}
