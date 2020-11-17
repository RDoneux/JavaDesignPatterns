package principles.liskovsubstitution;

public class SlowCar implements Vehicle {

    private int speed;

    public SlowCar() {
        speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void go() {
        int previousSpeed = speed;
        speed = 10;
        System.out.println(String.format(
            "Vehicle accelerating from %s to %s",
            previousSpeed,
            speed
            )
        );
    }

    @Override
    public void stop() {
        speed = 0;
    }
}
