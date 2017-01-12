package design.state;

/**
 * name: State
 * description:: 定義系統的狀態為 停止、暫停與工作中
 * Created by bryant on 2017/1/12
 */
public class State {
    public enum SystemState {STOP, SUSPEND, WORKING, START }
    public  SystemState systemState =SystemState.STOP ;

    public  void setState(SystemState systemState){
        this.systemState =  systemState;
    }


}
