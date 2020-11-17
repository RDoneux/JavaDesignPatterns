package patterns.builder.fluent;

import java.util.List;

/**
 * The generics are required in this case to enable use of the fluent API.
 *
 * If we did not consider the generics, the implementations would not be extensible
 * in the desired way.
 *
 * We extend vehicle to avoid duplication of the getters.
 *
 * @param <T> Object we want to build
 * @param <U> Builder we want to use to build Object T
 */
public interface VehicleBuilder<T extends Vehicle, U extends VehicleBuilder<T,?>> extends Vehicle {
    U name(String name);
    U numberOfWheels(Integer numberOfWheels);
    U fuelType(FuelType fuelType);
    U fuelTypes(List<FuelType> fuelTypes);

    T build();
}
