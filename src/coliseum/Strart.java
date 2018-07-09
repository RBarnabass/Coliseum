package coliseum;

import menu.MainMenu;

import static coliseum.Messenger.*;

public class Strart {

    private MainMenu menu = new MainMenu();
    private boolean result = Boolean.TRUE;

    public void startCycle() throws InterruptedException {

        showMainGreatings();

        try {
            while (result) {

                result = menu.showStartMenu();
            }
        } catch (InterruptedException e) {

            showDrownGame();
            startCycle();

        } catch (IllegalArgumentException e) {

            System.err.println(" Incorrect input !");
        }

        seeYouCoward();
    }
}
