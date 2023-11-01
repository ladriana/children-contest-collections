package ro.scoalainformala.business;

import java.util.Objects;
import java.util.UUID;

public class Prize implements Comparable<Prize> {
    private String type;
    private String colour;
    private int inventoryNo;

    public Prize(String type, String colour, int inventoryNo) {
        this.type = type;
        this.colour = colour;
        this.inventoryNo = inventoryNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getInventoryNod() {
        return inventoryNo ;
    }

    public void setInventoryNo(int inventoryNo) {
        this.inventoryNo = inventoryNo;
    }

    public String toString() {
        return "The prize " + getType() + " has the colour " + getColour() +
                " and the inventory number " + getInventoryNod();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof Prize other) {
            return other.getInventoryNod() == this.getInventoryNod();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType());
    }

    @Override
    public int compareTo(Prize p) {

        if (this.inventoryNo > p.inventoryNo) {
            return 1;
        } else if (this.inventoryNo == p.inventoryNo) {
            return 0;
        }
        return -1;
    }

}
