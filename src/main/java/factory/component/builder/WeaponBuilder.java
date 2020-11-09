package factory.component.builder;

public class WeaponBuilder extends AbstractShipComponentBuilder<WeaponBuilder> {

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
}
