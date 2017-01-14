package design.observer;

/**
 * Name: MasterSlaveDemo.java
 * Description :  主從式架構，當主伺服器發送訊息給其他從級伺服器
 * Created by bryant on 2017/1/14.
 */
public class MasterSlaveDemo {

    public  static  void main(String[] args){
        MasterSubject master = new MasterSubject();
        SlaveObserver slave01 = new SlaveObserver("slave-1",master);
        SlaveObserver slave02 = new SlaveObserver("slave-2",master);
        SlaveObserver slave03 = new SlaveObserver("slave-3",master);

        master.register(slave01);
        master.register(slave02);
        master.register(slave03);

        master.postMessage("同步更新資料");

        master.unregister(slave02);
        master.postMessage("slave-2不更新");

    }
}
