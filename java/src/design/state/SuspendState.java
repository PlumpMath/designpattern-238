package design.state;

/**
 * name: SuspendState
 * description:: 機器暫停
 * Created by bryant on 2017/1/12
 */
public class SuspendState implements  Machine {
    @Override
    public void operate(State state) {
        System.out.println("機器暫停") ;
        state.setState(State.SystemState.SUSPEND);
    }
}
