package design.stragety;

/**
 *  Name: EnterTradeStragety.java
 * Description :  入庫拋帳
 * Created by bryant on 2017/1/14.
 */
public class EnterTradeStragety implements  TradeStragety{
    @Override
    public boolean doTrade() {
        System.out.println("入庫拋帳成功");
        return true;
    }
}
