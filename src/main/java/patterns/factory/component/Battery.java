package patterns.factory.component;

import patterns.factory.component.builder.BatteryBuilder;

public class Battery extends AbstractShipComponent<BatteryBuilder> {
    private final Integer powerOutput;

    public Battery(BatteryBuilder builder) {
        super(builder);
        this.powerOutput = builder.getPowerOutput();
    }
    public Integer getPowerOutput() {
        return powerOutput;
    }
}
