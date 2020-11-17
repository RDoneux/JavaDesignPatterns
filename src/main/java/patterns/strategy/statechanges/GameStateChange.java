package patterns.strategy.statechanges;

import patterns.strategy.EventType;
import patterns.strategy.StateChange;

public class GameStateChange implements StateChange {
    @Override
    public EventType getType() {
        return EventType.GAME_STATE_CHANGE;
    }
}
