package design.singleton;

/**
 * Name: singleton
 * Description :
 * Created by blackbryant on 2017/1/7.
 */
public class DBConfigSingltonLazy {
    private  static  DBConfigSingltonLazy singlton = null;
    private String className ;
    private String db_url ;
    private String user;
    private String password;

    private  DBConfigSingltonLazy(String className, String db_url, String user, String password){
        this.className = className ;
        this.db_url= db_url ;
        this.user = user ;
        this.password = password ;
    }

    public static synchronized DBConfigSingltonLazy getInstance(){
        if(singlton==null){
            singlton= new DBConfigSingltonLazy("com.mysql.jdbc.Driver","jdbc:mysql://localhost/EMP","jack","123456");
        }

        return singlton ;
    }

}
