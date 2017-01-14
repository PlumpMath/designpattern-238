package design.stragety;

import design.state.State;

/**
 *  Name: SaleTradeStragety.java
 * Description :  銷售拋帳
 * Created by bryant on 2017/1/14.
 */
public class SaleTradeStragety implements  TradeStragety{
    @Override
    public boolean doTrade() {
        System.out.println("銷售拋帳成功");
        return true;
    }
}
