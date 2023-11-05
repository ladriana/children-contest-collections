package ro.scoalainformala;


import ro.scoalainformala.business.Prize;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Prize> prizes = new LinkedList<>();
        prizes.add(new Prize("toy", "blue", 5));
        prizes.add(new Prize("book", "red", 6));
        prizes.add(new Prize("toy", "blue", 1));
        prizes.add(new Prize("shirt", "green", 2));
        prizes.add(new Prize("book", "blue", 7));
        prizes.add(new Prize("shirt", "blue", 8));
        prizes.add(new Prize("toy", "blue", 4));
        prizes.add(new Prize("toy", "yellow", 3));

        System.out.println("The number of contest participants is: 5");
        int c = 5;
        Set<Prize> givenPrizes = new TreeSet<>();

        System.out.println("The inventory of prizes at the beginning of the contest is: ");
        for (Prize p : prizes) {
            System.out.println(p);
        }

        Scanner pr = new Scanner(System.in);
        do {
            System.out.println("Please select a prize from the current inventory " +
                    "(by entering an available inventory number): ");
            int childPrize = pr.nextInt();
            if (childPrize >= 0 && childPrize < 8) {
                //System.out.println(prizes.get(childPrize).getInventoryNo());

                for (int i = 0; i < prizes.size(); i++) {
                    if (childPrize == prizes.get(i).getInventoryNo()) {
                        givenPrizes.add(prizes.get(i));
                        prizes.remove(i);
                        c--;
                    }

                }
                System.out.println("\nThe current prize inventory is:");
                for (Prize p : prizes) {
                    System.out.println(p);
                }

                System.out.println("\nThe given prizes inventory is:");
                for (Prize p : givenPrizes) {
                    System.out.println(p);
                }

            } else {
                System.out.println(" Please enter a number between 1-8:  ");
            }

        } while (c != 0);
    }
}