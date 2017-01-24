package design.adapter;

/**
 * name: Volt.java
 * description: 電壓物件
 * Created by bryant on 2017/1/124
 */
public class Volt {

    private float volt ;

    public  Volt(float volt){
        this.volt = volt ;
    }

    //取得電壓
    public  float getV(){
        return  this.volt ;
    }

}
