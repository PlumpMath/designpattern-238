package design.state;

/**
    * name: StopState
    * description:  關閉機器狀態
    * Created by bryant on 2017/1/12
    */
public class StopState implements  Machine {
    @Override
    public void operate(State state) {
        System.out.println("關閉機器") ;
        state.setState(State.SystemState.STOP);
    }
}
