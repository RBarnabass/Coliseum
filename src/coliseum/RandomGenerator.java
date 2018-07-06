package coliseum;

import warriors.*;
import weapons.*;

import java.util.Scanner;

public class RandomGenerator {

    private Scanner scan = new Scanner(System.in);

    private Warrior getWarriorRandom(int ran) {

        switch (ran) {

            case 0: {

                return getExperiencedWarrior(new Gladiator(getRabdomName(), getWeapon(getRandomWeaponNumber())));
            }

            case 1: {

                return getExperiencedWarrior(new Barbarian(getRabdomName(), getWeapon(getRandomWeaponNumber())));
            }

            case 2: {

                return getExperiencedWarrior(new Viking(getRabdomName(), getWeapon(getRandomWarriorNumber())));
            }

            case 3: {

                return getExperiencedWarrior(new Cossack(getRabdomName(), getWeapon(getRandomWarriorNumber())));
            }

            case 4: {

                return getExperiencedWarrior(new Samurai(getRabdomName(), getWeapon(getRandomWarriorNumber())));
            }
        }

        return null;
    }

    private Warrior getWarrior(int ran) {

        switch (ran) {

            case 0: {

                return getExperiencedWarrior(new Gladiator(writeName(), getWeapon(getRandomWeaponNumber())));
            }

            case 1: {

                return getExperiencedWarrior(new Barbarian(writeName(), getWeapon(getRandomWeaponNumber())));
            }

            case 2: {

                return getExperiencedWarrior(new Viking(writeName(), getWeapon(getRandomWarriorNumber())));
            }

            case 3: {

                return getExperiencedWarrior(new Cossack(writeName(), getWeapon(getRandomWarriorNumber())));
            }

            case 4: {

                return getExperiencedWarrior(new Samurai(writeName(), getWeapon(getRandomWarriorNumber())));
            }
        }

        return null;
    }

    public Weapon getWeapon(int ran) {

        switch (ran) {

            case 0: {

                return new Axe();
            }

            case 1: {

                return new Sword();
            }

            case 2: {

                return new Spear();
            }

            case 3: {

                return new Yataghan();
            }

            case 4: {

                return new Bow();
            }

            case 5: {

                return new Cudgel();
            }

            case 6: {

                return new Halberd();
            }

            case 7: {

                return new Blade();
            }

            case 8: {

                return new Rapier();
            }

            case 9: {

                return new Tomahawk();
            }

            case 10: {

                return new Dagger();
            }
        }

        return null;
    }

    public int getRandomWeaponNumber() {

        return (int) getRandom(0, 11);
    }

    private int getRandomWarriorNumber() {

        return (int) getRandom(0, 5);
    }
    public String writeName() {

        System.out.print(" Enter your hero name, please - ");

        return scan.nextLine();
    }

    public int getRandomFirstKickerNumber() {

        return (int) getRandom(0, 2);
    }

    public Warrior getExperiencedWarrior(Warrior warrior) {

        warrior.setDefence(getRandom(10, 45));
        warrior.setWarriorWeight(getRandom(55, 125));
        warrior.setDexterity(getRandom(300, 550));
        warrior.setPower(getRandom(70, 130));
        warrior.setHealth(getRandom(100, 200));
        warrior.getHarm();

        return warrior;
    }

    private double getRandom(int min, int max) {

        return  (min + Math.random() * (max - min));
    }

    public Warrior getAutomatic() {

       return getWarriorRandom(getRandomWarriorNumber());
    }

    private String getRabdomName() {

        return "Player " + (int) getRandom(1000, 9999);
    }

    public Warrior getManual() {

        return getWarrior(getRandomWarriorNumber());
    }
}