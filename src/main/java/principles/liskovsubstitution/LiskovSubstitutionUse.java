package principles.liskovsubstitution;

import java.util.List;

public class LiskovSubstitutionUse {

    public static void main(String[] main) {

        // Interfaces define contracts for implementations of that type
        // In this example Vehicle is a supertype of FastCar and SlowCar

        // Liskov basically said that you should be able to replace the Type with it's supertype and it will still work the same
        // In this case we know the FastCar supertype is Vehicle, but it still works as if we called the FastCar
        Vehicle fastCar = new FastCar();
        Vehicle slowCar = new SlowCar();

        List<Vehicle> vehicles = List.of(fastCar, slowCar);
        vehicles.forEach(Vehicle::go);

        // In general we would work with the interfaces instead of the concrete objects themselves
        // We do this so that the implementations might change, the subtypes may change, but they all need
        // to abide by the same interface, so we can be sure this won't change (it would break everything if you did)
        fastCar.go();
        slowCar.go();

        // This is possible because we have defined a contract, which the objects need to abide by
    }
}
