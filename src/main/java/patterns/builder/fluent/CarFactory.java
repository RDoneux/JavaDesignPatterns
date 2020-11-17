package patterns.builder.fluent;

public class CarFactory {

    public Car petrolCar() {
        return Car.builder()
            .name("Petrol Car")
            .numberOfWheels(4)
            .fuelType(FuelType.PETROL)
            .build();
    }

    public Car hybridCar() {
        return Car.builder()
            .name("Hybrid Car")
            .numberOfWheels(4)
            .fuelType(FuelType.ELECTRICITY)
            .fuelType(FuelType.DIESEL)
            .build();
    }

    public Car electricCar() {
        return Car.builder()
            .name("Electric Car")
            .numberOfWheels(4)
            .fuelType(FuelType.ELECTRICITY)
            .build();
    }

    public static void main(String[] args) {
        var carFactory = new CarFactory();
        var electric = carFactory.electricCar();
        Car hybrid = carFactory.hybridCar();
        Vehicle petrol = carFactory.petrolCar();

        Car threeWheeledCar = hybrid.toBuilder().numberOfWheels(3).build();

        System.out.println(electric.toString());
        System.out.println(hybrid.toString());
        System.out.println(petrol.toString());
        System.out.println(threeWheeledCar.toString());
    }
}
