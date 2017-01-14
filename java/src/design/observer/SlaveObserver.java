package design.observer;

import design.state.State;

/**
 * Name: Observer.java
 * Description :  觀察者
 * Created by bryant on 2017/1/14.
 */
public class SlaveObserver implements IObserver{

    private String name ;
    private ISubject master ;

    //設定名稱與訂閱端
    public  SlaveObserver(String name, MasterSubject master){
        this.name = name ;
        this.master = master ;
    }

    @Override
    public void update() {
        String message = (String) this.master.update();
        if(message==null){
            System.out.println("no message");
        }else{
            System.out.println(name+":"+message);
        }
    }
}
