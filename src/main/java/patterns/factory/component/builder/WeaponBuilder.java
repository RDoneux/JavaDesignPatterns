package patterns.factory.component.builder;

import factory.component.Weapon;

public class WeaponBuilder extends AbstractShipComponentBuilder<Weapon, WeaponBuilder> {

    private Integer damageOutput;

    public WeaponBuilder() {
        // EMPTY
    }

    public WeaponBuilder damageOutput(Integer damageOutput) {
        this.damageOutput = damageOutput;
        return this;
    }

    public Integer getDamageOutput() {
        return damageOutput;
    }

    @Override
    public Weapon build() {
        return new Weapon(this);
    }
}
