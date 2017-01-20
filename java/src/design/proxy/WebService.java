package design.proxy;

/**
 * Name: IService.java
 * Description :  網站託管
 * Created by bryant on 2017/1/20.
 */
public class WebService implements IService {


    @Override
    public void doAction() {
         System.out.println("進行託管");
    }
}
