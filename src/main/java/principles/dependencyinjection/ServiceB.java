package principles.dependencyinjection;

public class ServiceB {
    String nameOfService;

    public ServiceB(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public String getNameOfService() {
        return nameOfService;
    }
}
