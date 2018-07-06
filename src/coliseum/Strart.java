package coliseum;

import static coliseum.Messenger.seeYouCoward;
import static coliseum.Messenger.showDrownGame;
import static coliseum.Messenger.showMainGreatings;

public class Strart {

    private MainMenu menu = new MainMenu();
    private boolean result = Boolean.TRUE;

    public void startCycle() throws InterruptedException {

        showMainGreatings();

        try {
            while (result) {

                result = menu.showStartMenu();
                seeYouCoward();
            }
        } catch (InterruptedException e) {

            showDrownGame();
            startCycle();
        }
    }
}