package menu;

import coliseum.*;
import enums.EnumWeaponMenu;
import warriors.Barbarian;
import weapons.*;

public class BarbarianWeaponMenu {

    private RandomGenerator rg = new RandomGenerator();

    public boolean showBarbarianWeaponMenu() throws InterruptedException {

        Messenger.showChooseHeroWeaponMenu();

        switch (EnumWeaponMenu.getOrdinal(Scannering.getInForWeaponMenu())) {

            case AXE: {

                Battle.letsFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Axe())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case BLADE: {

                Battle.letsFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Blade())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case BOW: {

                Battle.letsFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Bow())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case CUDGEL: {

                Battle.letsFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Cudgel())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case DAGGER: {

                Battle.letsFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Dagger())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case HALBERD: {

                Battle.letsFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Halberd())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case RAPIER: {

                Battle.letsFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Rapier())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case SPEAR: {

                Battle.letsFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Spear())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case SWORD: {

                Battle.letsFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Sword())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case TOMAHAWK: {

                Battle.letsFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Tomahawk())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                break;
            }

            case YATAGHAN: {

                Battle.letsFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Yataghan())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
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

