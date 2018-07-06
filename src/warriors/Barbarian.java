package warriors;

import weapons.Weapon;

public class Barbarian extends Warrior{

    public Barbarian(String name, Weapon weapon) {

        super(name, weapon);
        setDefinitionName("Barbarian");
        setAlive(true);
    }

    @Override
    public double getHarm() {

        return getWeapon().getWeight() * 0.6 + getWeapon().getDamage() * 0.6 + getPower() * 0.3;
    }

    @Override
    public double getProtection() {

        return getDexterity() / getWarriorWeight() + getDefence() + 1;
    }
}
