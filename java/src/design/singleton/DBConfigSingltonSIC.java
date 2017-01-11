package design.singleton;

/**
 * Name: singleton
 * Description : Static Inner Class mode
 * Created by blackbryant on 2017/1/7.
 */
public class DBConfigSingltonSIC {
    private  static DBConfigSingltonSIC singlton = null;
    private String className ;
    private String db_url ;
    private String user;
    private String password;

    private DBConfigSingltonSIC(String className, String db_url, String user, String password){
        this.className = className ;
        this.db_url= db_url ;
        this.user = user ;
        this.password = password ;
    }

    public  static DBConfigSingltonSIC getInstance(){
        return SingletonHolder.singleton;
    }


    public static class SingletonHolder{
        private static final DBConfigSingltonSIC singleton =   new DBConfigSingltonSIC("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/EMP", "jack", "123456");
    }
}
