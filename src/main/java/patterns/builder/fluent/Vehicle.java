package patterns.builder.fluent;

import java.util.List;

/**
 * Defining the getters here will enforce the use of fields in all sub-types of the class
 */
public interface Vehicle {
    String getName();
    Integer getNumberOfWheels();
    List<FuelType> getFuelTypes();
}
