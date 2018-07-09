package menu;

import coliseum.Battle;
import coliseum.Messenger;
import coliseum.RandomGenerator;
import coliseum.Scannering;
import enums.EnumChooseWarriorMenu;
import warriors.*;

public class ChooseWarriorRandomWeaponMenu {

    private RandomGenerator rg = new RandomGenerator();

    public boolean showChooseWarriorRandomWeaponMenu() throws InterruptedException {

        Messenger.showChooseHeroMenu();

        switch (EnumChooseWarriorMenu.getOrdinal(Scannering.getInForHeroMenu())) {

            case GLADIATOR: {

                Battle.letsFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), rg.getWeapon(rg.getRandomWeaponNumber()))), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case BARBARIAN: {

                Battle.letsFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), rg.getWeapon(rg.getRandomWeaponNumber()))), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case COSSACK: {

                Battle.letsFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), rg.getWeapon(rg.getRandomWeaponNumber()))), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case VIKING: {

                Battle.letsFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), rg.getWeapon(rg.getRandomWeaponNumber()))), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case SAMURAI: {

                Battle.letsFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), rg.getWeapon(rg.getRandomWeaponNumber()))), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case MAIN_MENU: {

                return Boolean.TRUE;
            }

            case DEFAULT_EXIT: {

                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
}
