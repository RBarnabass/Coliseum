package enums;

public enum EnumChooseWarriorMenu {

    DEFAULT_EXIT,
    GLADIATOR,
    BARBARIAN,
    COSSACK,
    VIKING,
    SAMURAI,
    MAIN_MENU;

    EnumChooseWarriorMenu() {

    }

    public static EnumChooseWarriorMenu getOrdinal(int input) {

        for (EnumChooseWarriorMenu k: EnumChooseWarriorMenu.values()) {

            if (k.ordinal() == input) {

                return k;
            }
        }

        return DEFAULT_EXIT;
    }
}
