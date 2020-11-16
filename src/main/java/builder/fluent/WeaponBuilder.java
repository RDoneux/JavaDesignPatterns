package builder.fluent;

import java.util.UUID;

public class WeaponBuilder implements ComponentBuilder<Weapon, WeaponBuilder> {
    private UUID id;
    private String name;

    public WeaponBuilder() {
        // EMPTY
    }

    @Override
    public WeaponBuilder id(UUID id) {
        this.id = id;
        return this;
    }

    @Override
    public WeaponBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Weapon build() {
        return new Weapon(this);
    }
}
