package design.singleton;

/**
 * Name: singleton
 * Description : Static Inner Class mode
 * Created by blackbryant on 2017/1/7.
 */
public enum DBConfigSingltonEnum {

    INSTANCE{
        public void DBConfig(){
            String className =  "com.mysql.jdbc.Driver"  ;
            String db_url=  "jdbc:mysql://localhost/EMP" ;
            String user = "jack" ;
            String password = "123456" ;
        }
    };


    public static DBConfigSingltonEnum  getInstance(){
       return DBConfigSingltonEnum.INSTANCE;
    }
}
