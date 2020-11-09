package factory.component.builder;

import java.util.UUID;

public interface ComponentBuilder<T extends ComponentBuilder<?>> {

    T id (UUID id);
    T name (String name);
    T connected(Boolean connected);
    T health(Integer health);
    T pointsValue(Integer pointsValue);

    UUID getId();
    String getName();
    Boolean isConnected();
    Integer getHealth();
    Integer getPointsValue();
}
