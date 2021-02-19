package basic_of_oop.basicOfOOP_5.gift.wrapping;

import java.util.Objects;

public abstract class Wrapping {
    private String color;
    private int price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Wrapping(String color, int price) {
        this.color = color;
        this.price = price;
    }


    public String toString() {
        return "Box: " +
                "color = " + color + ' ' +
                ", price = " + price + "$.";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wrapping wrapping = (Wrapping) o;
        return price == wrapping.price && Objects.equals(color, wrapping.color);
    }


    public int hashCode() {
        return Objects.hash(color, price);
    }
}
