package design.factory;

/**
 * Name: CarFactory.java
 * Description :  汽車工廠，產生MPV和SUV汽車
 * Created by bryant on 2017/1/9.
 */
public class CarFactory {

    public  <T extends  IProduct> T createCar(Class<T> cls){
        IProduct product = null ;
        try{
            product = (IProduct) Class.forName(cls.getName()).newInstance() ;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return  (T) product ;
    }


    //主程式測試
    public static void  main(String[] args){
        //MPV
        CarFactory carFactory = new CarFactory();
        IProduct MPVProduct = carFactory.createCar(MPV.class) ;
        System.out.println("car style:"+MPVProduct.getName());
        System.out.print("color:");
        for(String color:MPVProduct.getColor()){
            System.out.print(color+",");
        }
        System.out.print("operate:");
        for(String operate:MPVProduct.getOperate()){
            System.out.print(operate+",");
        }

        //SUV
        System.out.println();
        IProduct SUVProduct = carFactory.createCar(SUV.class) ;
        System.out.println("car style:"+SUVProduct.getName());
        System.out.print("color:");
        for(String color:SUVProduct.getColor()){
            System.out.print(color+",");
        }
        System.out.print("operate:");
        for(String operate:SUVProduct.getOperate()){
            System.out.print(operate+",");
        }

    }
}
