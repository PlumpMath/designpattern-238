package design.state;

/**
 * name: Machine
 * description:  定義狀態介面用來連接動作和狀態
 * Created by bryant on 2017/1/12
 */
public interface Machine {
    public  void operate(State state );
}
