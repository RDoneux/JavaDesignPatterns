package patterns.builder.standard;

import java.util.UUID;

public class ExampleFactory {
    public Weapon gun() {
        WeaponBuilder builder = Weapon.builder();
        builder.setId(UUID.randomUUID());
        builder.setName("Gun");
        return builder.build();
    }

    public Weapon missile() {
        WeaponBuilder weaponBuilder = Weapon.builder();
        weaponBuilder.setId(UUID.randomUUID());
        weaponBuilder.setName("Missile");
        return weaponBuilder.build();
    }
}
