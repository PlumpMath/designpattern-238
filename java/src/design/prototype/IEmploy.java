package design.prototype;

import java.math.BigDecimal;

/**
 * name: IEmploy.java
 * descirpt: 員工薪水抽象物件，主要用來建立基本資料、薪水、加班費等等
 * Created by bryant on 2017/1/8.
 */
abstract  class  IEmploy {

    //基本薪水
    abstract  protected void setBaseSalary(BigDecimal baseSalary);
    //津貼
    abstract  protected void setBonus(BigDecimal bouns);
    //加班費
    abstract  protected void setOvertimeSalary(int hour);
    //基本資料
    abstract protected void setProfile(Profile profile);

    //基本薪水
    abstract protected  BigDecimal getBaseSalary() ;
    //津貼
    abstract protected  BigDecimal getBonus() ;
    //加班費
    abstract protected  BigDecimal getOvertimeSalary() ;
    //全部薪水
    abstract protected  BigDecimal getFullSalary() ;
    //基本資料
    abstract protected Profile  getProfile();
}
