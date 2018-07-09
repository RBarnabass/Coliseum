package enums;

public enum EnumWeaponMenu {

    DEFAULT_EXIT,
    AXE,
    BLADE,
    BOW,
    CUDGEL,
    DAGGER,
    HALBERD,
    RAPIER,
    SPEAR,
    SWORD,
    TOMAHAWK,
    YATAGHAN,
    PREVIOUS_MENU;

    EnumWeaponMenu() {

    }

    public static EnumWeaponMenu getOrdinal(int input) {

        for (EnumWeaponMenu k: EnumWeaponMenu.values()) {

            if (k.ordinal() == input) {

                return k;
            }
        }

        return DEFAULT_EXIT;
    }
}

