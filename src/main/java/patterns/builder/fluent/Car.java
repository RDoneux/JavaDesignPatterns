package patterns.builder.fluent;

import java.util.Collections;
import java.util.List;

/**
 * A concrete implementation of a {@link Vehicle}, in this case, to abide by the contract, we need
 * to implement fields for all the getters defined in vehicle.
 * <p>
 * This class is suppose to be Immutable, hence for lists and other dynamic objects we wnat to ensure
 * we are making these immutable too.
 *
 * <b>Best Practise</b>
 * - Make everything as closed as possible (private final)
 * - Prefer immutability over mutability
 * - Don't forget to make collections immutable
 * - Constructor is package-private and not public - you want to make sure only access is through the patterns.builder
 */
public class Car implements Vehicle {
    private final String name;
    private final Integer numberOfWheels;
    private final List<FuelType> fuelTypes;

    Car(CarBuilder builder) {
        name = builder.getName();
        numberOfWheels = builder.getNumberOfWheels();
        fuelTypes = Collections.unmodifiableList(builder.getFuelTypes());
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

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    /**
     * Creates a patterns.builder object.
     *
     * This gives you a way to mutate the object without actually making this object mutable.
     *
     * @return CarBuilder
     */
    public CarBuilder toBuilder() {
        return builder()
            .fuelTypes(this.fuelTypes)
            .name(this.name)
            .numberOfWheels(this.numberOfWheels);
    }

    @Override
    public String toString() {
        return String.format("This %s has %s wheels and has the following fuel types: %s", name, numberOfWheels, fuelTypes);
    }
}
