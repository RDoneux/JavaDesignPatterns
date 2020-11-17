package patterns.observer;

import java.util.UUID;

public interface Observer {
    UUID getId();
    void update();
}
