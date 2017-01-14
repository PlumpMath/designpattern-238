package design.observer;

/**
 * Name: ISubject.java
 * Description :  主題
 * Created by bryant on 2017/1/14.
 */
public interface ISubject {
    //註冊
    public void register(IObserver observer) ;
    //取消註冊
    public void unregister(IObserver observer);
    //更新主題
    public  String update();
    //通知觀察者
    public void notifyObservers();
}
