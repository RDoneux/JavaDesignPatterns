package principles.dependencyinjection;

public class DependencyInjector {

    private final String nameOfService;
    private final Long numberOfServices;

    public DependencyInjector(Long numberOfServices, String nameOfService) {
        this.numberOfServices = numberOfServices;
        this.nameOfService = nameOfService;
    }

    public ServiceA createServiceA() {
        return new ServiceA(numberOfServices);
    }

    public ServiceB createServiceB() {
        return new ServiceB(nameOfService);
    }
}
