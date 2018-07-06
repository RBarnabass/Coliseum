package warriors;

import weapons.Weapon;

public class Samurai extends Warrior{

    public Samurai(String name, Weapon weapon) {

        super(name, weapon);
        setDefinitionName("Samurai");
        setAlive(true);
    }

    @Override
    public double getHarm() {

        return getWeapon().getWeight() * 0.7 + getWeapon().getDamage() * 0.6 + getPower() * 0.45;
    }

    @Override
    public double getProtection() {

        return getDexterity() / getWarriorWeight() + getDefence() + 1;
    }
}

