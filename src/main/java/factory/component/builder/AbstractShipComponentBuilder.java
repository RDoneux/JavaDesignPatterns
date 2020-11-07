package factory.component.builder;

import java.util.UUID;

public abstract class AbstractShipComponentBuilder implements ComponentBuilder {
    private Integer pointsValue;
    private Integer health;
    private Boolean connected;
    private UUID id;
    private String name;

    public AbstractShipComponentBuilder() {
        // empty
    }

    public ComponentBuilder pointsValue(Integer pointsValue) {
        this.pointsValue = pointsValue;
        return this;
    }
    public ComponentBuilder health(Integer health) {
        this.health = health;
        return this;
    }
    public ComponentBuilder connected(Boolean connected){
        this.connected = connected;
        return this;
    }
    public ComponentBuilder name (String name) {
        this.name = name;
        return this;
    }
    public ComponentBuilder id (UUID id) {
        this.id = id;
        return this;
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
