package factory.component;

import factory.component.builder.WeaponBuilder;

public class Weapon extends AbstractShipComponent<WeaponBuilder> {

    private final Integer damageOutput;

    public Weapon(WeaponBuilder builder) {
        super(builder);
        this.damageOutput = builder.getDamageOutput();
    }

    public Integer getDamageOutput() {
        return damageOutput;
    }
}
