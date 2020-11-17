package patterns.factory.component.builder;

import factory.component.Battery;

public class BatteryBuilder extends AbstractShipComponentBuilder<Battery, BatteryBuilder> {

    private Integer powerOutput;

    public BatteryBuilder() {
        super();
    }

    public BatteryBuilder powerOutput(Integer powerOutput) {
        this.powerOutput = powerOutput;
        return this;
    }

    public Integer getPowerOutput() {
        return powerOutput;
    }

    @Override
    public Battery build() {
        return new Battery(this);
    }
}
