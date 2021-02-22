package basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.wrapping.wrappingpaper;

import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.wrapping.Wrapping;

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
