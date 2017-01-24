package design.adapter;

/**
 *  name: Adaptee.java
 * description:  傳統變壓器
 * Created by bryant on 2017/1/24.
 */
public class Adaptee {

    public  Volt getVolt(){
        return new Volt(120) ;
    }
}
