package principles.interfacesegregation;

import principles.interfacesegregation.impl.Bike;
import principles.interfacesegregation.impl.Boat;
import principles.interfacesegregation.impl.Car;

public class InterfaceSegregationUse {

    private static void lockVehicle(Lockable lockableVehicle) {

        if(lockableVehicle.isLocked()) {
            System.out.println("Car is already locked");
            return;
        }

        System.out.println("Locking car");
        lockableVehicle.lock();
    }

    private static void refuelVehicle(Refuelable refuelable) {
        int fuelBefore = refuelable.getFuel();
        refuelable.refuel();
        System.out.println(String.format(
            "Refueled %s from %s to %s",
            ((Vehicle) refuelable).getType(),
            fuelBefore,
            refuelable.getFuel()
        ));
    }

    private static void moveVehicle(Vehicle vehicle) {
        int speedBefore = vehicle.getSpeed();
        vehicle.go();
        System.out.println(String.format(
            "%s accelerated from %s to %s MPH",
            vehicle.getType(),
            speedBefore,
            vehicle.getSpeed()
        ));
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        Boat boat = new Boat();

        lockVehicle(car);
        lockVehicle(car);

        refuelVehicle(boat);
        refuelVehicle(car);

        moveVehicle(bike);
        moveVehicle(car);
        moveVehicle(boat);
    }
}
