package warriors;

import weapons.Weapon;

public class Gladiator extends Warrior {

    public Gladiator(String name, Weapon weapon) {

        super(name, weapon);
        setDefinitionName("Gladiator");
        setAlive(true);
    }

    @Override
    public double getHarm() {

        return getWeapon().getWeight() * 0.7 + getWeapon().getDamage() * 0.5 + getPower() * 0.2;
    }

    @Override
    public double getProtection() {

        return getDexterity() / getWarriorWeight() + getDefence() + 2;
    }
}
