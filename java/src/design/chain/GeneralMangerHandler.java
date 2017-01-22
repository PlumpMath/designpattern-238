package design.chain;

import java.math.BigDecimal;

/**
 *  name: GeneralMangerHandler.java
 * Description :   總經理
 * Created by bryant on 2017/1/22.
 */
public class GeneralMangerHandler extends  IProcessHandler {
    @Override
    public BigDecimal getLimit() {
        return new BigDecimal("100000");
    }

    @Override
    public void info() {
        System.out.println("總經理核准");
    }
}
