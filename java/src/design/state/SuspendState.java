package design.state;

/**
 * Created by bryant on 2017/1/12.
 */
public class SuspendState implements  Machine {
    @Override
    public void operate(State state) {
        System.out.println("Suspend machine") ;
        state.setState(State.SystemState.SUSPEND);
    }
}
