package design.state;

/**
 * name: MachineDemo
 * description:  測試狀態
 * Created by bryant on 2017/1/12
 */
public class MachineDemo {

    public  static  void main(String[] args){
        State state = new State();
        Machine startMachine = new StartState();
        startMachine.operate(state);

    }


}
