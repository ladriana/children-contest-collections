package ro.scoalainformala.business;

import java.util.*;

public class GivenPrize {
    private Set<BetterPrize> prizeGiven;

    public GivenPrize() {
        prizeGiven = new TreeSet<>();
    }

    public void addPrize(BetterPrize prize) {
        prizeGiven.add(prize);
        // prize.setQuantity(prize.getQuantity() + 1);
    }

    public static void changeInventory(List<BetterPrize> prizeList, BetterPrize prize) {
        int a = prizeList.get(prizeList.indexOf(prize)).getQuantity();
        a = a - 1;
        prizeList.get(prizeList.indexOf(prize)).setQuantity(a);
        if (a == 0) {
            prizeList.remove(prize);
        }
    }

    public void displayList() {
        for (BetterPrize a : prizeGiven) {
            System.out.println(a);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GivenPrize that = (GivenPrize) o;
        return Objects.equals(prizeGiven, that.prizeGiven);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prizeGiven);
    }
}
