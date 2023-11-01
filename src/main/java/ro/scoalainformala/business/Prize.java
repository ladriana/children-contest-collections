package ro.scoalainformala.business;

import java.util.Objects;
import java.util.UUID;

public class Prize implements Comparable<Prize> {
    private String type;
    private String colour;
    private UUID id;

    public Prize(String type, String colour) {
        this.type = type;
        this.colour = colour;
        id = UUID.randomUUID();
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String toString() {
        return "The toy " + getType() + "has the colour " + getColour() +
                " and Id " + getId();
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof Prize other) {
            return other.getId() == this.getId();
        }
        return false;
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(getType());
    }

    @Override
    public int compareTo(Prize p) {
        return this.type != null ?
                (p.type != null ? this.type.compareTo(p.type) : 1) :
                -1;
    }

}
