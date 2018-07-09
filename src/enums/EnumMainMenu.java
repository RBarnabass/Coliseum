package enums;

public enum EnumMainMenu {

    DEFAULT_EXIT,
    AUTOMATIC_RANDOM_FIGHT,
    CHOOSE_HERO_RANDOM_WEAPON,
    CHOOSE_HERO_AND_CHOOSE_WEAPON,
    MULTIPLAYER;

    EnumMainMenu() {

    }

    public static EnumMainMenu getOrdinal(int input) {

        for (EnumMainMenu k: EnumMainMenu.values()) {

            if (k.ordinal() == input) {

                return k;
            }
        }

        return DEFAULT_EXIT;
    }
}
