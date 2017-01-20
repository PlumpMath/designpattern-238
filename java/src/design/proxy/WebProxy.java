package design.proxy;

/**
 * Name: WebProxy.java
 * Description :  代理模式
 * Created by bryant on 2017/1/20.
 */
public class WebProxy  {
    private IService service  ;
    public WebProxy(IService service){
        this.service = service ;
    }

    public void action(){
        //執行服務前條件
        System.out.println("託管前設定");

        this.service.doAction();
        //其他條件
        System.out.println("本次託管費用");
    }

}
