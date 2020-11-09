package factory.component.builder;

public class BatteryBuilder extends AbstractShipComponentBuilder<BatteryBuilder> {

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

}
