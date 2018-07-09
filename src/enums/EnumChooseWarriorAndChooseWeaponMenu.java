package enums;

public enum EnumChooseWarriorAndChooseWeaponMenu {

    DEFAULT_EXIT,
    GLADIATOR_WEAPON,
    BARBARIAN_WEAPON,
    COSSACK_WEAPON,
    VIKING_WEAPON,
    SAMURAI_WEAPON,
    MAIN_MENU;

    EnumChooseWarriorAndChooseWeaponMenu() {

    }

    public static EnumChooseWarriorAndChooseWeaponMenu getOrdinal(int input) {

        for (EnumChooseWarriorAndChooseWeaponMenu k: enums.EnumChooseWarriorAndChooseWeaponMenu.values()) {

            if (k.ordinal() == input) {

                return k;
            }
        }

        return DEFAULT_EXIT;
    }
}

