package principles.interfacesegregation.impl;

import principles.interfacesegregation.Vehicle;

public class Bike implements Vehicle {
    private int speed;

    public Bike() {
        speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void go() {
        speed = 10;
    }

    @Override
    public void stop() {
        speed = 0;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.BIKE;
    }
}
