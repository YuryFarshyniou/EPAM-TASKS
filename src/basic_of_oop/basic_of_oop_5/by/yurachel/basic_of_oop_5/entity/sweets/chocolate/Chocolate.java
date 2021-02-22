package basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.sweets.chocolate;

import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.sweets.Sweets;

public class Chocolate extends Sweets {
    public Chocolate(String name, int price, String shape, String taste) {
        super(name, price, shape, taste);
    }


    public String toString() {
        return "Chocolate: " +
                "name = " + getName() +
                ", price = " + getPrice() + '$' +
                ", shape = " + getShape() +
                ", taste = " + getTaste();
    }
}
