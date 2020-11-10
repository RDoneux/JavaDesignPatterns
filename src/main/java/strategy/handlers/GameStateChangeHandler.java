package strategy.handlers;

import strategy.StateChange;
import strategy.StateChangeHandler;

public class GameStateChangeHandler implements StateChangeHandler {
    @Override
    public void handle(StateChange stateChange) {
        System.out.println("Handling GameStateChange");
    }
}
