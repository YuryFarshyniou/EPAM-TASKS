package basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.wrapping.box;

import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.wrapping.Wrapping;

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
