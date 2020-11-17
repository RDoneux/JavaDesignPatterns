package principles.interfacesegregation.impl;

import principles.interfacesegregation.Lockable;
import principles.interfacesegregation.Refuelable;
import principles.interfacesegregation.Vehicle;

public class Car implements Vehicle, Refuelable, Lockable {

    private boolean locked;
    private int fuel;
    private int speed;

    public Car() {
        locked = false;
        fuel = 100;
        speed = 0;
    }

    @Override
    public boolean isLocked() {
        return locked;
    }

    @Override
    public void lock() {
        locked = true;
    }

    @Override
    public void unlock() {
        locked = false;
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
        speed = 30;
    }

    @Override
    public void stop() {
        speed = 0;
    }

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }
}
