package design.stragety;

/**
 *  Name: TradeStragetyDemo.java
 * Description : 策略模式-Demo
 * Created by bryant on 2017/1/14.
 */
public class TradeStragetyDemo {
    private TradeStragety tradeStragety ;
    public TradeStragetyDemo(TradeStragety tradeStragety){
        this.tradeStragety = tradeStragety  ;
    }

    public  void doTrade(){
         this.tradeStragety.doTrade();
    }


    public static void main(String[] args){
        TradeStragetyDemo saleDemo = new  TradeStragetyDemo(new SaleTradeStragety());
        saleDemo.doTrade();
        TradeStragetyDemo returnDemo = new  TradeStragetyDemo(new ReturnTradeStragety());
        returnDemo.doTrade();
    }
}
