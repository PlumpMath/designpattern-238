package design.state;

/**
 * Created by bryant on 2017/1/12.
 */
public class StopState implements  Machine {
    @Override
    public void operate(State state) {
        System.out.println("Stop machine") ;
        state.setState(State.SystemState.STOP);
    }
}
