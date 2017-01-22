package design.chain;

import java.math.BigDecimal;

/**
 *  name: ManagerHandler.java
 * Description :   副總
 * Created by bryant on 2017/1/22.
 */
public class ViceGeneralManger extends  IProcessHandler {
    @Override
    public BigDecimal getLimit() {
        return new BigDecimal("10000");
    }

    @Override
    public void info() {
        System.out.println("副總核准");
    }
}
