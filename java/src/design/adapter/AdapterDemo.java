package design.adapter;

/**
 *  name: AdapterDemo.java
 * description:  變壓器Demo
 * Created by bryant on 2017/1/24.
 */
public class AdapterDemo {

    public  static  void main(String[] args) {
        //Class Adapter
        Adapter adapter = new Adapter();
        System.out.println(adapter.convertVolt(0.5f));

        //Object Adapter
        AdapterComposition adapterCompsition = new AdapterComposition() ;
        System.out.println(adapterCompsition.convertVolt(0.2f));

    }
}
