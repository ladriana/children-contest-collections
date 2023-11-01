package ro.scoalainformala;


import ro.scoalainformala.business.Prize;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Set<Prize> prizes = new TreeSet<>();
        prizes.add(new Prize("toy", "blue", 5));
        prizes.add(new Prize("book", "red", 6));
        prizes.add(new Prize("toy", "blue", 1));
        prizes.add(new Prize("shirt", "green", 2));
        prizes.add(new Prize("book", "blue", 7));
        prizes.add(new Prize("shirt", "blue", 8));
        prizes.add(new Prize("toy", "blue", 4));
        prizes.add(new Prize("toy", "yellow", 3));

        System.out.println("The inventory of prizes at the beginning of the contest is: ");
        for (Prize p : prizes) {
            System.out.println(p);

        }

       /* do {

        }

        while (prizes.size() != 0); */

        Scanner pr = new Scanner(System.in);
        System.out.println("The child can chose his prize from the curent inventory: ");
        int childPrize = pr.nextInt();
        //if (childPrize == prizes.ge)

        Prize pe = new Prize("toy", "blue", 5);
        prizes.remove(pe);

        System.out.println("The inventory of prizes at the beginning of the contest is: ");
        for (Prize p : prizes) {
            System.out.println(p);
        }
    }
}