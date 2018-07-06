package coliseum;

public class Messenger {

    public static void showMainGreatings() throws InterruptedException {

        System.out.println();
        System.out.println(" -- Welcome to Coliseum -- ");
        Thread.sleep(1200);
        System.out.println(" - Smells fresh mortal - ");
        Thread.sleep(1200);
        System.out.println(" Are you ready to die tonight? ");
        Thread.sleep(1000);
        System.out.println("        yes / no ??? ");
        Thread.sleep(700);
        System.out.println(" It's too late... ");
        Thread.sleep(500);
        System.out.println(" HA-ha-ha-ha ");
        System.out.println();
    }

    public static void showMainMenu() {

        System.out.println();
        System.out.println("      Lets play");
        System.out.println();
        System.out.println(" >>> 1 - Automatic fight" + '\n' + " >>> 2 - Choose hero with random weapon" + '\n' + " >>> 3 - Choose hero and weapon" + '\n' + " >>> 4 - Multiplayer    (in progress...)"  + '\n' + " >>> 0 - I'm afraid");
        System.out.println();
    }

    public static void showChooseHeroMenu() {

        System.out.println();
        System.out.println("    Choose your hero");
        System.out.println();
        System.out.println(" >>> 1   < Gladiator >" + '\n' + " >>> 2   < Barbarian >" + '\n' + " >>> 3   < Cossack >" + '\n' + " >>> 4   < Viking >" + '\n' + " >>> 5   < Samurai >" + '\n' + " >>> 6   - Previous menu"  + '\n' + " >>> 0   - I'm afraid");
        System.out.println();
    }

    public static void showChooseHeroWeaponMenu() {

        System.out.println();
        System.out.println("    Choose your hero's weapon");
        System.out.println();
        System.out.println(" >>> 1   * Axe *" + '\n' + " >>> 2   * Blade *" + '\n' + " >>> 3   * Bow *" + '\n' + " >>> 4   * Cudgel *" + '\n' + " >>> 5   * Dagger *" + '\n' + " >>> 6   * Halberd *" + '\n' + " >>> 7   * Rapier *" + '\n' + " >>> 8   * Spear *" + '\n' + " >>> 9   * Sword *" + '\n' + " >>> 10  * Tomahawk *" + '\n' + " >>> 11  * Yataghan *" + '\n' + " >>> 12  - Previous menu" + '\n' + " >>> 0   - I'm afraid");
        System.out.println();
    }

    public static void seeYouCoward() {

        System.out.println();
        System.out.println("  See you next time... coward !");
    }

    public static void showAutomaticMenu() {

        System.out.println();
        System.out.println("    Choose your game");
        System.out.println();
        System.out.println(" >>> 1  - Automatic computer game" + '\n' + " >>> 2  - Automatic multiplayer" + '\n' + " >>> 3   - Previous menu"  + '\n' + " >>> 0   - I'm afraid");
    }

    public static void showDrownGame() {

        System.out.println();
        System.err.println(" DROWN GAME ");
        System.out.println();
    }
}
