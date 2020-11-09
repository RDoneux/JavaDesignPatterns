package factory;

import factory.component.builder.BatteryBuilder;

import java.util.UUID;

public class ComponentBuilderFactory {
    private ComponentBuilderFactory() {
        // Empty
    }

    public static BatteryBuilder battery() {
        return new BatteryBuilder()
            .id(UUID.randomUUID())
            .powerOutput(654)
            .name("Name");
    }
}
