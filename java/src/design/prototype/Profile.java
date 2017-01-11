package design.prototype;

/**
 * name: Profile.java
 * descirpt:ion: 個人基本資料: 姓名
 * Created by bryant on 2017/1/8.
 */
public class Profile implements  Cloneable {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
