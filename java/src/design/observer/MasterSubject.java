package design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *MasterSubject.java
 * Description :  主伺服器
 * Created by bryant on 2017/1/14.
 */
public class MasterSubject implements  ISubject {
    private List<IObserver> slave ;
    private boolean change;
    private  String message ;
    public  MasterSubject(){
        this.slave = new ArrayList<IObserver>();
    }

    @Override
    public void register(IObserver observer) {
        if(observer==null){
            throw  new NullPointerException("Null Observer");
        }else{
            slave.add(observer);

        }
    }

    @Override
    public void unregister(IObserver observer) {
        if(observer==null){
            throw  new NullPointerException("Null Observer");
        }else{
            slave.remove(observer);
        }
    }

    @Override
    public String update() {
      return this.message ;
    }

    @Override
    public void notifyObservers() {
        if(this.change){
            for(IObserver observer : this.slave){
                observer.update();
            }
        }
    }

    //送出訊息
    public void postMessage(String mesage){
        this.message = mesage ;
        this.change = true ;
        notifyObservers();
    }

}
