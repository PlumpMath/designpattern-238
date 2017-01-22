package design.chain;

import java.math.BigDecimal;

/**
 * name: IProcessHandler.java
 * Description :  管理者簽核處理-抽象
 * Created by bryant on 2017/1/22.
 */
public abstract class IProcessHandler {

    protected  IProcessHandler nextHandler;
    protected  BigDecimal money ;

    public  final  void handler(BigDecimal money){
        this.money = money;
        info();

        if(money.compareTo(getLimit())==1){
            this.nextHandler.handler(money);
        }
    }

    public abstract BigDecimal getLimit();
    public  abstract  void info();

}
