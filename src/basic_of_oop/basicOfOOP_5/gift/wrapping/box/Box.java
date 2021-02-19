package basic_of_oop.basicOfOOP_5.gift.wrapping.box;

import basic_of_oop.basicOfOOP_5.gift.wrapping.Wrapping;

public class Box extends Wrapping {

    public Box(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return "Box: " +
                "color = " + getColor() + ' ' +
                ", price = " + getPrice() + "$";
    }
}
