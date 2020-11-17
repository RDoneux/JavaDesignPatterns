package patterns.factory.component;

import patterns.factory.component.builder.AbstractShipComponentBuilder;

import java.util.UUID;

public abstract class AbstractShipComponent<T extends AbstractShipComponentBuilder<?,?>> implements ShipComponent {
    private final Integer pointsValue;
    private final Integer health;
    private final Boolean connected;
    private final UUID id;
    private final String name;

    public AbstractShipComponent(T builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.pointsValue = builder.getPointsValue();
        this.health = builder.getHealth();
        this.connected = builder.isConnected();
    }

    public Integer getPointsValue() {
        return pointsValue;
    }

    public Integer getHealth() {
        return health;
    }

    public Boolean isConnected() {
        return connected;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
