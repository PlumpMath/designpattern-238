package design.chain;

import java.math.BigDecimal;

/**
 *  name: ManagerHandler.java
 * Description :  經理簽核
 * Created by bryant on 2017/1/22.
 */
public class ManagerHandler extends  IProcessHandler{
    @Override
    public BigDecimal getLimit() {
        return new BigDecimal("1000");
    }

    @Override
    public void info() {
        System.out.println("經理核准");
    }

}
