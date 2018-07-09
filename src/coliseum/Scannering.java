package coliseum;

import java.util.Scanner;

public class Scannering {

    private static Scanner scan = new Scanner(System.in);
    private static int tmp;

    public static int getInForMainMenu() {

        if (scan.hasNextInt()) {

            tmp = scan.nextInt();

            return (tmp < 0 || tmp > 4) ? getInForMainMenu() : tmp;
        }

        throw new IllegalArgumentException();
    }

    public static int getInForHeroMenu() {

        if (scan.hasNextInt()) {

            tmp = scan.nextInt();

            return (tmp < 0 || tmp > 6) ? getInForHeroMenu() : tmp;
        }

        throw new IllegalArgumentException();
    }

    public static int getInForWeaponMenu() {
        int tmp;

        if (scan.hasNextInt()) {

            tmp = scan.nextInt();

            return (tmp < 0 || tmp > 12) ? getInForWeaponMenu() : tmp;
        }

        throw new IllegalArgumentException();
    }

    public static int getInAutomaticGameMenu() {
        int tmp;

        if (scan.hasNextInt()) {

            tmp = scan.nextInt();

            return (tmp < 0 || tmp > 3) ? getInAutomaticGameMenu() : tmp;
        }

        throw new IllegalArgumentException();
    }
}
