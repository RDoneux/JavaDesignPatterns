package patterns.strategy.statechanges;

import patterns.strategy.EventType;
import patterns.strategy.StateChange;

public class PlayerStateChange implements StateChange {
    @Override
    public EventType getType() {
        return EventType.PLAYER_STATE_CHANGE;
    }
}
