package builder.fluent;

import java.util.UUID;

public class ExampleFactory {
    public Weapon gun() {
        return Weapon.builder()
            .id(UUID.randomUUID())
            .name("Gun")
            .build();
    }

    public Weapon missile() {
        return Weapon.builder()
            .id(UUID.randomUUID())
            .name("Missile")
            .build();
    }
}
