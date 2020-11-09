package factory.component.builder;

import java.util.UUID;

/**
 * The unchecked expressions have been ignored as the binding for T is such that
 * there can never be a case where it can not cast to T.
 *
 * @param <T>
 */
public abstract class AbstractShipComponentBuilder<T extends ComponentBuilder<?>> implements ComponentBuilder<T> {
    private Integer pointsValue;
    private Integer health;
    private Boolean connected;
    private UUID id;
    private String name;

    public AbstractShipComponentBuilder() {
        // empty
    }

    public T pointsValue(Integer pointsValue) {
        this.pointsValue = pointsValue;
        //noinspection unchecked
        return (T) this;
    }

    public T health(Integer health) {
        this.health = health;
        //noinspection unchecked
        return (T) this;
    }
    public T connected(Boolean connected) {
        this.connected = connected;
        //noinspection unchecked
        return (T) this;
    }
    public T name (String name) {
        this.name = name;
        //noinspection unchecked
        return (T) this;
    }
    public T id (UUID id) {
        this.id = id;
        //noinspection unchecked
        return (T) this;
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
