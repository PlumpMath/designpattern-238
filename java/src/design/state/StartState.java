package design.state;

/**
 * Created by bryant on 2017/1/12.
 */
public class StartState implements  Machine {
    @Override
    public void operate(State state) {
        System.out.println("start machine") ;
        state.setState(State.SystemState.START);
    }
}
