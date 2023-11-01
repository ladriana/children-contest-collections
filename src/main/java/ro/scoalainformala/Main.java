package ro.scoalainformala;


import ro.scoalainformala.business.Prize;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Set<Prize> prizes = new HashSet<>();
        prizes.add(new Prize("toy", "blue"));
        prizes.add(new Prize("book", "red"));
        prizes.add(new Prize("toy", "blue"));
        prizes.add(new Prize("shirt", "green"));
        prizes.add(new Prize("book", "blue"));
        prizes.add(new Prize("shirt", "blue"));
        prizes.add(new Prize("toy", "blue"));
        prizes.add(new Prize("toy", "yellow"));

        //Collections.sort(prizes);
        for (Prize p : prizes) {
            System.out.println(p);
        }
    }
}