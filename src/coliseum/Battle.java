package coliseum;

import warriors.Warrior;

public class Battle {

    private static int kickCount1 = 0;
    private static int kickCount2 = 0;
    private static final int index = 3;

    public static Warrior letsFight(Warrior warrior1, Warrior warrior2, int firstKicker) throws InterruptedException {

        System.out.println();
        double kick1 = warrior1.getHarm() - warrior2.getProtection();
        double kick2 = warrior2.getHarm() - warrior1.getProtection();

        while (warrior1.isAlive() && warrior2.isAlive()) {

            switch (firstKicker) {

                case 0: {

                    if (kick1 > 0) {

                        Thread.sleep(300);
                        kickCount1++;
                        double tmpKick = kick1 * getViolence() + getExtraHarm();
                        warrior2.setHealth(warrior2.getHealth() - tmpKick);
                        System.out.println(" ^^^ K/n " + kickCount1 + "    " + warrior1.getName() + "    made punch with damage: " + String.format("%8.2f", tmpKick) + "       " + warrior2.getName() + " health left: " + String.format("%8.2f", warrior2.getHealth()));
                    }

                    if (warrior2.getHealth() <= 0) {

                        warrior2.setAlive(false);
                        System.out.println("The looser is :" + '\n' + warrior2.toString());
                        System.out.println("The winner is :" + '\n' + warrior1.toString());
                        break;
                    }
                }

                case 1: {

                    if (kick2 > 0) {

                        Thread.sleep(300);
                        kickCount2++;
                        double tmpKick = kick2 * getViolence() + getExtraHarm();
                        warrior1.setHealth(warrior1.getHealth() - tmpKick);
                        System.out.println(" ^^^ K/n " + kickCount2 + "    " + warrior2.getName() + "    made punch with damage: " + String.format("%8.2f", tmpKick) + "       " + warrior1.getName() + " health left: " + String.format("%8.2f", warrior1.getHealth()));
                    }

                    if (warrior1.getHealth() <= 0) {

                        warrior1.setAlive(false);
                        System.out.println("The looser is :" + '\n' + warrior1.toString());
                        System.out.println("The winner is :" + '\n' + warrior2.toString());
                    }

                    if (firstKicker == 1) {

                        firstKicker = 0;
                    }
                }

                default:

                if (kickCount1 >= 15 && kickCount2 >= 15 && warrior1.getHealth() >= 100 && warrior2.getHealth() >= 100) {

                    throw new InterruptedException();
                }
            }

            if (kickCount1 == index && kickCount2 == index) {

               kick1 = getCheckIt(getTired(kick1));
               kick2 = getCheckIt(getTired(kick2));
            }

            if (kickCount1 == index * 2 && kickCount2 == index * 2) {

                kick1 = getCheckIt(getTired(kick1));
                kick2 = getCheckIt(getTired(kick2));
            }

            if (kickCount1 == index * 3 && kickCount2 ==  index * 3) {

                kick1 = getCheckIt(getTired(kick1));
                kick2 = getCheckIt(getTired(kick2));
            }
        }

        Thread.sleep(700);

        return warrior1.isAlive() ? warrior1 : warrior2;
    }

    private static int getViolence() {

        int i = (int) (Math.random() * 5);

        return i <= 0 || i > 2 ? 1 : i;
    }

    private static double getExtraHarm() {

        return Math.random() * 10;
    }

    private static double getTired(double kick) {

        return kick -= 2;
    }

    private static double getCheckIt(double kick) {

        return kick < 0 ? 0 : kick;
    }
}