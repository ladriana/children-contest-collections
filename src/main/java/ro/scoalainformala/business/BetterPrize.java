package ro.scoalainformala.business;

import java.util.Objects;

public class BetterPrize implements Comparable<BetterPrize> {
    private String type;
    private int quantity;

    public BetterPrize(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public BetterPrize(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int increaseQuantity() {

        return quantity = getQuantity() + 1;
    }

    public String toString() {
        return "Prize " + getType() + "/ quantity: " + getQuantity();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BetterPrize that = (BetterPrize) o;
        return Objects.equals(getType(), that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType());
    }

    @Override
    public int compareTo(BetterPrize prize) {
        return this.type.compareTo(prize.type);
    }
}
