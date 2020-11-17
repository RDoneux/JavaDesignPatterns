package patterns.observer;

import java.util.UUID;

public class ObserverB extends AbstractObserver {
    private final UUID id;
    private final Subject subject;
    private String value;

    public ObserverB(Subject subject) {
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
        this.value = subject.getValue() + "BB";
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " has value = {" + this.value + "}";
    }
}
