package design.chain;

import java.math.BigDecimal;

/**
 *  name: ManagerHandler.java
 * Description :   簽核demo
 * Created by bryant on 2017/1/22.
 */
public class ManagerDemo {

    public  static  void main(String[] args){
        ManagerHandler managerHandler = new ManagerHandler();
        ViceGeneralManger viceGeneralManager = new ViceGeneralManger() ;
        GeneralMangerHandler generalManger = new GeneralMangerHandler();
        managerHandler.nextHandler = viceGeneralManager;
        viceGeneralManager.nextHandler= generalManger;
        managerHandler.handler(new BigDecimal(100000));

    }
}
