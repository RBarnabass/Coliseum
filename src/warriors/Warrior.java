package warriors;

import weapons.Weapon;

public abstract class Warrior implements Attackable, Deffendable {

    private String name;
    private String definitionName;
    private int number;
    private double warriorWeight;
    private Weapon weapon;
    private double defence;
    private double dexterity;
    private double power;
    private double health;
    private boolean isAlive;

    public Warrior(String name, Weapon weapon) {

        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {

        return name;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public Weapon getWeapon() {

        return weapon;
    }

    public void setWeapon(Weapon weapon) {

        this.weapon = weapon;
    }

    public double getDefence() {

        return defence;
    }

    public void setDefence(double defence) {

        this.defence = defence;
    }

    public double getWarriorWeight() {

        return warriorWeight;
    }

    public void setWarriorWeight(double warriorWeight) {

        this.warriorWeight = warriorWeight;
    }

    public double getDexterity() {

        return dexterity;
    }

    public void setDexterity(double dexterity) {

        this.dexterity = dexterity;
    }

    public double getPower() {

        return power;
    }

    public void setPower(double power) {

        this.power = power;
    }

    public double getHealth() {

        return health;
    }

    public void setHealth(double health) {

        this.health = health;
    }

    public boolean isAlive() {

        return isAlive;
    }

    public void setAlive(boolean alive) {

        isAlive = alive;
    }

    public String getDefinitionName() {

        return definitionName;
    }

    public void setDefinitionName(String definitionName) {

        this.definitionName = definitionName;
    }

    @Override
    public String toString() {

        freeSpace(7);

        StringBuilder sb = new StringBuilder();

        return  " --------------- Warrior -------------- " + '\n' +
                sb.append(" Rank        ") + definitionName + '\n' +
                " Name        " + name + '\n' +
                /*" Number       " + number + '\n' +*/
                " Weight    " +    String.format("%8.2f", warriorWeight) + '\n' +
                " Defence  " +     String.format("%8.2f", defence) + '\n' +
                " Dexterity " +    String.format("%8.2f", dexterity) + '\n' +
                " Power     " +    String.format("%8.2f", power) + '\n' +
                " Health    " +    String.format("%8.2f", health) + '\n' +
                " IsAlive     " +  isAlive + '\n' +
                " --------------- " + weapon +  '\n';
    }

    private void freeSpace(int i) {

       if (i == 0)  {
           return;
       }

        freeSpace(--i);
        System.out.println();
    }
}