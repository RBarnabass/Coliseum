package warriors;

import weapons.Weapon;

public class Viking extends Warrior{

    public Viking(String name, Weapon weapon) {

        super(name, weapon);
        setDefinitionName("Viking");
        setAlive(true);
    }

    @Override
    public double getHarm() {

        return getWeapon().getWeight() * 0.7 + getWeapon().getDamage() * 0.7 + getPower() * 0.4;
    }

    @Override
    public double getProtection() {

        return getDexterity() / getWarriorWeight() + getDefence();
    }
}
