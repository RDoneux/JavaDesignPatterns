package principles.interfacesegregation;

import principles.interfacesegregation.impl.VehicleType;

/**
 * Interfaces can be used for abstraction/inheritence.
 *
 * When things start to move away from core functionality, then interface segregation comes in.
 *
 * For example, if we have a boat. A boat is {@link Refuelable} but not {@link Lockable}.
 *
 * Whereas a car is both {@link Refuelable} and {@link Lockable}.
 *
 * A bike is still a vehicle, but is neither {@link Refuelable} or {@link Lockable}.
 *
 * In this case we don't want methods/paramters pertaining to these things in our base interface.
 */
public interface Vehicle {
    int getSpeed();
    void go();
    void stop();
    VehicleType getType();
}
