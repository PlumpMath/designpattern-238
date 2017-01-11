package design.factory;

import java.util.List;

/**
 * Name: IProduct.java
 * Description :  產品抽象物件
 * Created by blackbryant on 2017/1/9.
 */
public abstract class IProduct {

   protected abstract String getName() ;
   protected abstract List<String> getColor() ;
   protected abstract List<String> getOperate();


}
