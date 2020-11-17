package principles.dependencyinjection;

public class DependencyInjectionClient {

    private ServiceA serviceA;
    private ServiceB serviceB;

    public DependencyInjectionClient(DependencyInjector dependencyInjector) {
        serviceA = dependencyInjector.createServiceA();
        serviceB = dependencyInjector.createServiceB();
    }

    public static void main(String[] args) {
        DependencyInjector dependencyInjector = new DependencyInjector(12L, "A");
        DependencyInjectionClient client = new DependencyInjectionClient(dependencyInjector);
    }
}
