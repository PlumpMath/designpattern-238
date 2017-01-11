package design.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: SUV.java
 * Description :  SUV
 * Created by bryant on 2017/1/9.
 */
public class SUV extends  IProduct {
    @Override
    protected String getName() {
        return "SUV";
    }

    @Override
    protected List<String> getColor() {
        List<String> colors = new ArrayList<String>();
        colors.add("紅");
        colors.add("藍");
        colors.add("鐵灰");
        return colors;
    }

    @Override
    protected  List<String>  getOperate() {
        List<String> operates = new ArrayList<String>();
        operates.add("煞車");
        operates.add("加速");
        operates.add("導航");
        operates.add("省油");
        return operates;
    }
}
