package menu;

import coliseum.Messenger;
import coliseum.Scannering;
import enums.EnumChooseWarriorAndChooseWeaponMenu;

public class ChooseWarriorAndChooseWeaponMenu {

    private GladiatorWeaponMenu gladiatorWeaponMenu = new GladiatorWeaponMenu();
    private BarbarianWeaponMenu barbarianWeaponMenu = new BarbarianWeaponMenu();
    private CossackWeaponMenu cossackWeaponMenu = new CossackWeaponMenu();
    private VikingWeaponMenu vikingWeaponMenu = new VikingWeaponMenu();
    private SamuraiWeaponMenu samuraiWeaponMenu = new SamuraiWeaponMenu();

    public boolean showChooseWarriorAndChooseWeaponMenu() throws InterruptedException {

        Messenger.showChooseHeroMenu();

        switch (EnumChooseWarriorAndChooseWeaponMenu.getOrdinal(Scannering.getInForHeroMenu())) {

            case GLADIATOR_WEAPON: {

                return gladiatorWeaponMenu.showGladiatorWeaponMenu() == Boolean.FALSE ? Boolean.FALSE : Boolean.TRUE;
            }

            case BARBARIAN_WEAPON: {

                return barbarianWeaponMenu.showBarbarianWeaponMenu() == Boolean.FALSE ? Boolean.FALSE : Boolean.TRUE;
            }

            case COSSACK_WEAPON: {

                return cossackWeaponMenu.showCossackWeaponMenu() == Boolean.FALSE ? Boolean.FALSE : Boolean.TRUE;
            }

            case VIKING_WEAPON: {

                return vikingWeaponMenu.showVikingWeaponMenu() == Boolean.FALSE ? Boolean.FALSE : Boolean.TRUE;
            }

            case SAMURAI_WEAPON: {

                return samuraiWeaponMenu.showSamuraiWeaponMenu() == Boolean.FALSE ? Boolean.FALSE : Boolean.TRUE;
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
