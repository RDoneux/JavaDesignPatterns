package builder;

import java.util.UUID;

public class Weapon implements Component {
    private final UUID id;
    private final String name;

    Weapon(WeaponBuilder builder) {
        id = builder.getId();
        name = builder.getName();
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public static WeaponBuilder builder() {
        return new WeaponBuilder();
    }
}
