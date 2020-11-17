package patterns.observer;

import java.util.UUID;

public class ObserverA extends AbstractObserver {
    private final UUID id;
    private final Subject subject;
    private String value;

    public ObserverA(Subject subject) {
        id = UUID.randomUUID();
        this.subject = subject;
        subject.register(this);
        this.update();
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void update() {
        this.value = subject.getValue() + "AA";
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " has value = {" + this.value + "}";
    }
}
