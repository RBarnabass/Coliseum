package enums;

public enum  EnumAutomaticGameMenu {

    DEFAULT_EXIT,
    AUTOMATIC_COMPUTER_GAME,
    AUTOMATIC_MULTIPLAYER,
    PREVIOUS_MENU;

    EnumAutomaticGameMenu() {

    }

    public static EnumAutomaticGameMenu getOrdinal(int input) {

        for (EnumAutomaticGameMenu k: EnumAutomaticGameMenu.values()) {

            if (k.ordinal() == input) {

                return k;
            }
        }

        return DEFAULT_EXIT;
    }
}
