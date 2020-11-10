package strategy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;
import strategy.handlers.GameStateChange;
import strategy.handlers.GameStateChangeHandler;
import strategy.handlers.PlayerStateChange;
import strategy.handlers.PlayerStateChangeHandler;

public class StrategyPattern {

    private static final Map<EventType, Class<? extends StateChange>> strategy = Map.of(
        EventType.GAME_STATE_CHANGE, GameStateChange.class,
        EventType.PLAYER_STATE_CHANGE, PlayerStateChange.class
    );

    private static final Map<EventType, StateChangeHandler> handlers = Map.of(
        EventType.GAME_STATE_CHANGE, new GameStateChangeHandler(),
        EventType.PLAYER_STATE_CHANGE, new PlayerStateChangeHandler()
    );

    private final ObjectMapper objectMapper;

    private StrategyPattern() {
        objectMapper = new ObjectMapper();
    }

    private void handleMessage(EventType eventType, String event) throws JsonProcessingException {
        var stateChange = objectMapper.readValue(event, strategy.get(eventType));
        handlers.get(eventType).handle(stateChange);
    }

    public static void main(String[] args) throws JsonProcessingException {
        var strategyPattern = new StrategyPattern();
        strategyPattern.handleMessage(EventType.PLAYER_STATE_CHANGE, "{}");
        strategyPattern.handleMessage(EventType.GAME_STATE_CHANGE, "{}");
    }
}
