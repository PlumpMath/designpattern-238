package design.template;

/**
 * Name: FtpProgress.java
 * Description : Ftp收檔子類別
 * Created by bryant on 2017/1/14.
 */
public class FtpProgress extends ContextTemplate {

    @Override
    protected boolean downloadDoc(String url, String to) {
        System.out.println("從FTP下載檔案到:"+to);
        return true;
    }

    @Override
    protected boolean parseDocc(String filename) {
        this.filename = filename ;
        System.out.println("利用CVS格式解析檔案"+this.filename);
        return true;
    }

    @Override
    protected void process() {
        System.out.println("做加總處理");
    }

    @Override
    protected void feedback() {
        super.feedback();
    }
}
