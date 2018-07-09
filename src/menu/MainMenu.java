package menu;

import coliseum.Messenger;
import coliseum.Scannering;
import enums.EnumMainMenu;

public class MainMenu {

    private AutomaticGameMenu automaticGameMenu = new AutomaticGameMenu();
    private ChooseWarriorRandomWeaponMenu chooseWarriorRandomWeaponMenu = new ChooseWarriorRandomWeaponMenu();


    public boolean showStartMenu() throws InterruptedException {

        Messenger.showMainMenu();

        switch (EnumMainMenu.getOrdinal(Scannering.getInForMainMenu())) {

            case AUTOMATIC_RANDOM_FIGHT: {

                return automaticGameMenu.showAutomaticGameMenu() == Boolean.FALSE ? Boolean.FALSE : Boolean.TRUE;
                }

            case CHOOSE_HERO_RANDOM_WEAPON: {

                return chooseWarriorRandomWeaponMenu.showChooseWarriorRandomWeaponMenu() == Boolean.FALSE ? Boolean.FALSE : Boolean.TRUE;
            }

            case CHOOSE_HERO_AND_CHOOSE_WEAPON: {

                return new ChooseWarriorAndChooseWeaponMenu().showChooseWarriorAndChooseWeaponMenu() == Boolean.FALSE ? Boolean.FALSE : Boolean.TRUE;
            }

            case MULTIPLAYER: {

            }

            case DEFAULT_EXIT: {

                return Boolean.FALSE;
            }

        }

        return Boolean.TRUE;
    }
}