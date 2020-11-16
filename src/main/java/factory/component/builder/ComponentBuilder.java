package factory.component.builder;

import factory.component.AbstractShipComponent;
import factory.component.Component;

import java.util.UUID;

public interface ComponentBuilder<U extends Component, T extends ComponentBuilder<U, ?>> {

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

    U build();
}
