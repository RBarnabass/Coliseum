package weapons;

public abstract class Weapon {

    private String name;
    private int weight;
    private int damage;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getDamage() {

        return damage;
    }

    public void setDamage(int damage) {

        this.damage = damage;
    }

    @Override
    public String toString() {

        return "Weapon -------------- " +  '\n' +
                " Name   " + name + '\n' +
                " Weight   " + weight +  '\n' +
                " Damage   " + damage +  '\n' +
                " ------------------------------------- ";
    }
}
