package design.singleton;

/**
 * Name: singleton
 * Description : Singleton double checkLock
 * Created by blackbryant on 2017/1/7.
 */
public class DBConfigSingltonDCL {
    private  static DBConfigSingltonDCL singlton = null;
    private String className ;
    private String db_url ;
    private String user;
    private String password;

    public DBConfigSingltonDCL(String className, String db_url, String user, String password){
        this.className = className ;
        this.db_url= db_url ;
        this.user = user ;
        this.password = password ;
    }

    public static  DBConfigSingltonDCL getInstance(){
        if(singlton==null){
            synchronized (DBConfigSingltonDCL.class) {
                if(singlton==null)
                    singlton = new DBConfigSingltonDCL("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/EMP", "jack", "123456");
            }
        }

        return singlton ;
    }

}
