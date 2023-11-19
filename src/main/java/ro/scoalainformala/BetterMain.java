package ro.scoalainformala;

import ro.scoalainformala.business.BetterPrize;
import ro.scoalainformala.business.GivenPrize;

import java.util.ArrayList;
import java.util.List;

public class BetterMain {
    public static void main(String[] args) {
        List<BetterPrize> prizeInventory = new ArrayList<>();
        prizeInventory.add(new BetterPrize("CarToy", 5));
        prizeInventory.add(new BetterPrize("TeddyBear", 3));
        prizeInventory.add(new BetterPrize("Shirt", 6));
        System.out.println("Prize inventory at the begining of the contest:");
        for (BetterPrize a : prizeInventory) {
            System.out.println(a);
        }
        GivenPrize givenPrize = new GivenPrize();
        BetterPrize Jon = new BetterPrize("CarToy", 1);
        GivenPrize.changeInventory(prizeInventory, Jon);
        givenPrize.addPrize(Jon);

        BetterPrize Anne = new BetterPrize("Shirt", 1);
        BetterPrize Bob = new BetterPrize("CarToy", 1);
        BetterPrize Vivien = new BetterPrize("TeddyBear", 1);
        for (BetterPrize a : prizeInventory) {
            System.out.println(a);
        }

       // for (BetterPrize x : givenPrize) {
         //   System.out.println(x);
       // }


    }
}
