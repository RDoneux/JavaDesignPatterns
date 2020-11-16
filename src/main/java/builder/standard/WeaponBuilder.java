package builder.standard;

import java.util.UUID;

public class WeaponBuilder implements ComponentBuilder<Weapon> {
    private UUID id;
    private String name;

    public WeaponBuilder() {
        // EMPTY
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
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Weapon build() {
        return new Weapon(this);
    }
}
