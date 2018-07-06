package coliseum;

import warriors.*;
import weapons.*;

public class MainMenu {

    private RandomGenerator rg = new RandomGenerator();
    private Scannering sc = new Scannering();

    public boolean showStartMenu() throws InterruptedException {

        Messenger.showMainMenu();

        switch (Scannering.getInForMainMenu()) {

            case 1: {

                Messenger.showAutomaticMenu();

                switch (Scannering.getInAutomaticGameMenu()) {

                    case 1: {

                        Battle.letFight(rg.getAutomatic(), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                        break;
                    }

                    case 2: {

                        Battle.letFight(rg.getManual(), rg.getManual(), rg.getRandomFirstKickerNumber());
                        break;
                    }

                    case 3: {

                        return showStartMenu();
                    }

                    case 0: {

                        return Boolean.FALSE;
                    }
                }

                break;
            }

            case 2: {

                Messenger.showChooseHeroMenu();

                switch (Scannering.getInForHeroMenu()) {

                    case 1: {

                        Battle.letFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), rg.getWeapon(rg.getRandomWeaponNumber()))), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                        break;
                    }

                    case 2: {

                        Battle.letFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), rg.getWeapon(rg.getRandomWeaponNumber()))), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                        break;
                    }

                    case 3: {

                        Battle.letFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), rg.getWeapon(rg.getRandomWeaponNumber()))), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                        break;
                    }

                    case 4: {

                        Battle.letFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), rg.getWeapon(rg.getRandomWeaponNumber()))), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                        break;
                    }

                    case 5: {

                        Battle.letFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), rg.getWeapon(rg.getRandomWeaponNumber()))), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                        break;
                    }

                    case 6: {

                        //return;
                        break;
                    }

                    case 0: {

                        return Boolean.FALSE;
                    }
                }

                break;
            }

            case 3: {

                Messenger.showChooseHeroMenu();

                switch (Scannering.getInForHeroMenu()) {

                    case 1: {

                        Messenger.showChooseHeroWeaponMenu();

                        switch (Scannering.getInForWeaponMenu()) {

                            case 1: {

                                Battle.letFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), new Axe())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 2: {

                                Battle.letFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), new Blade())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 3: {

                                Battle.letFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), new Bow())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 4: {

                                Battle.letFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), new Cudgel())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 5: {

                                Battle.letFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), new Dagger())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 6: {

                                Battle.letFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), new Halberd())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 7: {

                                Battle.letFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), new Rapier())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 8: {

                                Battle.letFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), new Spear())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 9: {

                                Battle.letFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), new Sword())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 10: {

                                Battle.letFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), new Tomahawk())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 11: {

                                Battle.letFight(rg.getExperiencedWarrior(new Gladiator(rg.writeName(), new Yataghan())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 12: {

                               break;
                            }

                            case 0: {

                                return Boolean.FALSE;
                            }
                        }
                        break;
                    }

                    case 2: {

                        Messenger.showChooseHeroWeaponMenu();

                        switch (Scannering.getInForWeaponMenu()) {

                            case 1: {

                                Battle.letFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Axe())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 2: {

                                Battle.letFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Blade())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 3: {

                                Battle.letFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Bow())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 4: {

                                Battle.letFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Cudgel())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 5: {

                                Battle.letFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Dagger())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 6: {

                                Battle.letFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Halberd())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 7: {

                                Battle.letFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Rapier())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 8: {

                                Battle.letFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Spear())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 9: {

                                Battle.letFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Sword())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 10: {

                                Battle.letFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Tomahawk())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 11: {

                                Battle.letFight(rg.getExperiencedWarrior(new Barbarian(rg.writeName(), new Yataghan())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 12: {

                                break;
                            }

                            case 0: {

                                return Boolean.FALSE;
                            }
                        }

                        break;
                    }

                    case 3: {

                        Messenger.showChooseHeroWeaponMenu();

                        switch (Scannering.getInForWeaponMenu()) {

                            case 1: {

                                Battle.letFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), new Axe())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 2: {

                                Battle.letFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), new Blade())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 3: {

                                Battle.letFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), new Bow())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 4: {

                                Battle.letFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), new Cudgel())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 5: {

                                Battle.letFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), new Dagger())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 6: {

                                Battle.letFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), new Halberd())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 7: {

                                Battle.letFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), new Rapier())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 8: {

                                Battle.letFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), new Spear())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 9: {

                                Battle.letFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), new Sword())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 10: {

                                Battle.letFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), new Tomahawk())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 11: {

                                Battle.letFight(rg.getExperiencedWarrior(new Cossack(rg.writeName(), new Yataghan())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 12: {

                                break;
                            }

                            case 0: {

                                return Boolean.FALSE;
                            }
                        }

                        break;
                    }

                    case 4: {

                        Messenger.showChooseHeroWeaponMenu();

                        switch (Scannering.getInForWeaponMenu()) {

                            case 1: {

                                Battle.letFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), new Axe())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 2: {

                                Battle.letFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), new Blade())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 3: {

                                Battle.letFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), new Bow())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 4: {

                                Battle.letFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), new Cudgel())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 5: {

                                Battle.letFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), new Dagger())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 6: {

                                Battle.letFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), new Halberd())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 7: {

                                Battle.letFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), new Rapier())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 8: {

                                Battle.letFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), new Spear())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 9: {

                                Battle.letFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), new Sword())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 10: {

                                Battle.letFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), new Tomahawk())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 11: {

                                Battle.letFight(rg.getExperiencedWarrior(new Viking(rg.writeName(), new Yataghan())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 12: {

                                break;
                            }

                            case 0: {

                                return Boolean.FALSE;
                            }
                        }

                        break;
                    }

                    case 5: {

                        Messenger.showChooseHeroWeaponMenu();

                        switch (Scannering.getInForWeaponMenu()) {

                            case 1: {

                                Battle.letFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), new Axe())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 2: {

                                Battle.letFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), new Blade())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 3: {

                                Battle.letFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), new Bow())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 4: {

                                Battle.letFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), new Cudgel())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 5: {

                                Battle.letFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), new Dagger())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 6: {

                                Battle.letFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), new Halberd())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 7: {

                                Battle.letFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), new Rapier())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 8: {

                                Battle.letFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), new Spear())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 9: {

                                Battle.letFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), new Sword())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 10: {

                                Battle.letFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), new Tomahawk())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 11: {

                                Battle.letFight(rg.getExperiencedWarrior(new Samurai(rg.writeName(), new Yataghan())), rg.getAutomatic(), rg.getRandomFirstKickerNumber());
                                break;
                            }

                            case 12: {

                                break;
                            }

                            case 0: {

                                return Boolean.FALSE;
                            }
                        }

                        break;
                    }

                    case 6: {

                        showStartMenu();
                    }

                    case 0: {

                        return Boolean.FALSE;
                    }
                }

                break;
            }

            case 4: {

                break;
            }

            case 0: {

                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
}
