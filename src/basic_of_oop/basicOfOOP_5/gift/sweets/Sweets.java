package basic_of_oop.basicOfOOP_5.gift.sweets;

import java.util.Objects;

public abstract class Sweets {

    private String name;
    private int price;
    private String shape;
    private String taste;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Sweets(String name, int price, String shape, String taste) {
        this.name = name;
        this.price = price;
        this.shape = shape;
        this.taste = taste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweets sweets = (Sweets) o;
        return price == sweets.price && Objects.equals(name, sweets.name) && Objects.equals(shape, sweets.shape) && Objects.equals(taste, sweets.taste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, shape, taste);
    }
}

