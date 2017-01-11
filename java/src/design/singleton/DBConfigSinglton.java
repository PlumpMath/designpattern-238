package design.singleton;

/**
 * Name: singleton
 * Description :  To generate  onaly one database configuration  instane when it is called
 * Created by blackbryant on 2017/1/7.
 */
public class DBConfigSinglton {
    private  static final DBConfigSinglton singlton = new DBConfigSinglton("com.mysql.jdbc.Driver","jdbc:mysql://localhost/EMP","jack","123456");
    private String className ;
    private String db_url ;
    private String user;
    private String password;

    private   DBConfigSinglton(String className, String db_url, String user, String password){
        this.className = className ;
        this.db_url= db_url ;
        this.user = user ;
        this.password = password ;
    }

    public static DBConfigSinglton getInstance(){
        return singlton ;
    }
}
