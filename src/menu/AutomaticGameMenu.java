package menu;

import coliseum.Battle;
import coliseum.Messenger;
import coliseum.RandomGenerator;
import coliseum.Scannering;
import enums.EnumAutomaticGameMenu;

public class AutomaticGameMenu {

    private RandomGenerator rg = new RandomGenerator();

    public boolean showAutomaticGameMenu() throws InterruptedException {

        Messenger.showAutomaticMenu();

        switch (EnumAutomaticGameMenu.getOrdinal(Scannering.getInAutomaticGameMenu())) {

            case AUTOMATIC_COMPUTER_GAME: {

                Battle.letsFight(rg.getAutomatic(), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case AUTOMATIC_MULTIPLAYER: {

                Battle.letsFight(rg.getManual(), rg.getManual(), rg.getRandomFirstKickerNumber());
                break;
            }

            case PREVIOUS_MENU: {

                return Boolean.TRUE;
            }

            case DEFAULT_EXIT: {

                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
}