package principles.dependencyinjection;

public class ServiceA {
    private final Long XPosition;

    public ServiceA(Long numberOfServices) {
        this.XPosition = numberOfServices;
    }

    public Long getXPosition() {
        return XPosition;
    }
}
