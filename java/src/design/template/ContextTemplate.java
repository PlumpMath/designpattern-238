package design.template;

import design.state.State;

/**
 * Name: ContextTemplate.java
 * Description :  內文收檔樣本
 * Created by bryant on 2017/1/14.
 */
public abstract class ContextTemplate {
    protected String filename ;

    //下載方法
    protected  boolean downloadDoc(String url, String to){
        if(url.equals(""))
            return  false ;
        else
            System.out.println("從"+url+"下載檔案到"+to) ;
        return true;
    }

    //解析文件
    protected  boolean parseDocc(String filename){
        if(filename.equals(""))
            return  false ;
        else
            this.filename = filename;
            System.out.println(filename+"解析檔案") ;
        return true;
    }

    //處理
    protected  void process(){
         System.out.println("處理盪案"+this.filename);
    }

    //回饋
    protected  void feedback(){
        System.out.println("檔案正確");
    }

}
