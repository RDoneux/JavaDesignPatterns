package patterns.strategy;

import java.util.Map;
import patterns.strategy.statechanges.GameStateChange;
import patterns.strategy.statechangehandlers.GameStateChangeHandler;
import patterns.strategy.statechanges.PlayerStateChange;
import patterns.strategy.statechangehandlers.PlayerStateChangeHandler;

/**
 * Simple Strategy Pattern implementation.
 *
 * The patterns.strategy part is in the selection of the handlers, where we use the type of object to determine
 * the correct handler to use.
 *
 * If we pass a PlayerStateChange object, we can get the type from the object and retrieve the
 * PlayerStateChangeHandler. With the same code we can also handle other StateChanges
 */
public class StrategyPattern {
    private static final Map<EventType, StateChangeHandler> handlers = Map.of(
        EventType.GAME_STATE_CHANGE, new GameStateChangeHandler(),
        EventType.PLAYER_STATE_CHANGE, new PlayerStateChangeHandler()
    );

    private StrategyPattern() {
        // EMPTY
    }

    private void handleMessage(StateChange stateChange) {
        handlers.get(stateChange.getType()).handle(stateChange);
    }

    public static void main(String[] args) {
        var strategyPattern = new StrategyPattern();
        strategyPattern.handleMessage(new PlayerStateChange());
        strategyPattern.handleMessage(new GameStateChange());
    }
}
