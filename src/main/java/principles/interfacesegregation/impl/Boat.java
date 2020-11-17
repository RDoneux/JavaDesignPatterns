package principles.interfacesegregation.impl;

import principles.interfacesegregation.Refuelable;
import principles.interfacesegregation.Vehicle;

public class Boat implements Vehicle, Refuelable {
    private int fuel;
    private int speed;

    public Boat() {
        fuel = 100;
        speed = 0;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void refuel() {
        fuel = Integer.MAX_VALUE;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void go() {
        speed = 20;
    }

    @Override
    public void stop() {
        speed = 0;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.BOAT;
    }
}
