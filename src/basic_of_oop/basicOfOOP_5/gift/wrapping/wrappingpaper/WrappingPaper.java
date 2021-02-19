package basic_of_oop.basicOfOOP_5.gift.wrapping.wrappingpaper;

import basic_of_oop.basicOfOOP_5.gift.wrapping.Wrapping;

public class WrappingPaper extends Wrapping {
    public WrappingPaper(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return "WrappingPaper: " +
                "color = " + getColor() +
                ", price = " + getPrice() + '$';
    }
}
