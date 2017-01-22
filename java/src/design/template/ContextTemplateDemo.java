package design.template;

/**
 * Name: ContextTemplateDemo.java
 * Description :  內文收檔樣本Demo
 * Created by bryant on 2017/1/14.
 */
public class ContextTemplateDemo {

    public  static void main(String[] args){
        FtpProgress ftpProgress = new FtpProgress();
        ftpProgress.downloadDoc("ftp:124567","C:file/");
        ftpProgress.parseDocc("aa.txt");
        ftpProgress.process();;
        ftpProgress.feedback();
    }

}
