package design.state;

/**
 * name: MachineDemo
 * description:  測試狀態
 * Created by bryant on 2017/1/12
 */
public class MachineDemo {

    public  static  void main(String[] args){
        System.out.println("工人七點上班，打開機器!");
        State state = new State();
        Machine startMachine = new StartState();
        startMachine.operate(state);
        System.out.println("中午休息!");
        Machine suspendMachine = new SuspendState();
        suspendMachine.operate(state);
        System.out.println("下班了!");
        Machine stopMachine = new StopState();
        stopMachine.operate(state);

    }


}
