package factory;

import factory.component.builder.BatteryBuilder;

import java.util.UUID;

public class ComponentBuilderFactory {
    private ComponentBuilderFactory() {
        // Empty
    }

    public static BatteryBuilder battery() {
        return (BatteryBuilder) new BatteryBuilder().id(UUID.randomUUID());
    }
}
