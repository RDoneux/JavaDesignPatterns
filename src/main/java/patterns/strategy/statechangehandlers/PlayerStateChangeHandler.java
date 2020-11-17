package patterns.strategy.statechangehandlers;

import patterns.strategy.StateChange;
import patterns.strategy.StateChangeHandler;

public class PlayerStateChangeHandler implements StateChangeHandler {
    @Override
    public void handle(StateChange stateChange) {
        System.out.println("Handling PlayerStateChange");
    }
}
