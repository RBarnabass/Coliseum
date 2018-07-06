package warriors;

import weapons.Weapon;

public class Cossack extends Warrior{

    public Cossack(String name, Weapon weapon) {

        super(name, weapon);
        setDefinitionName("Cossack");
        setAlive(true);
    }

    @Override
    public double getHarm() {

        return getWeapon().getWeight() * 0.8 + getWeapon().getDamage() * 0.8 + getPower() * 0.5;
    }

    @Override
    public double getProtection() {

        return getDexterity() / getWarriorWeight() + getDefence() + 5;
    }
}
