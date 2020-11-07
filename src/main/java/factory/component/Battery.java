package factory.component;

import factory.component.builder.BatteryBuilder;

public class Battery extends AbstractShipComponent {
    private final Integer powerOutput;

    public Battery(BatteryBuilder builder) {
        super(builder);
        this.powerOutput = builder.getPowerOutput();
    }
    public Integer getPowerOutput() {
        return powerOutput;
    }
}
