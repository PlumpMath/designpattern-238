package design.state;

/**
 * name: SuspendState
 * description:: 機器暫停
 * Created by bryant on 2017/1/12
 */
public class WorkState implements  Machine {
    @Override
    public void operate(State state) {
        System.out.println("機器工作中") ;
        state.setState(State.SystemState.WORKING);
    }
}
