package design.proxy;

/**
 * Name: IService.java
 * Description :  代理模式測試
 * Created by bryant on 2017/1/20.
 */
public class WebProxyDemo {

    public  static void main(String[] args){
        IService webService = new WebService();
        WebProxy proxy = new WebProxy(webService);
        proxy.action();
    }
}
