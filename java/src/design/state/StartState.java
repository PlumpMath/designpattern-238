package design.state;

/**
 * name: StartState
 * description:  打開機器狀態
 * Created by bryant on 2017/1/12
 */
public class StartState implements  Machine {
    @Override
    public void operate(State state) {
        System.out.println("機器開始運行") ;
        state.setState(State.SystemState.START);
    }
}
