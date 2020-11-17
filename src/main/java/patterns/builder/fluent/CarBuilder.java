package patterns.builder.fluent;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of a fluent interface patterns.builder for {@link Car}.
 *
 * A fluent interface means you can keep chaining commands, i.e. a().b().c().e();
 */
public class CarBuilder implements VehicleBuilder<Car, CarBuilder> {

    private String name;
    private Integer numberOfWheels;
    private final List<FuelType> fuelTypes;

    public CarBuilder() {
        fuelTypes = new ArrayList<>();
    }

    @Override
    public CarBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CarBuilder numberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        return this;
    }

    @Override
    public CarBuilder fuelType(FuelType fuelType) {
        this.fuelTypes.add(fuelType);
        return this;
    }

    @Override
    public CarBuilder fuelTypes(List<FuelType> fuelTypes) {
        this.fuelTypes.addAll(fuelTypes);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public List<FuelType> getFuelTypes() {
        return fuelTypes;
    }

    @Override
    public Car build() {
        return new Car(this);
    }
}
