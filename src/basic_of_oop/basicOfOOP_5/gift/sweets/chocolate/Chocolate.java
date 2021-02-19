package basic_of_oop.basicOfOOP_5.gift.sweets.chocolate;

import basic_of_oop.basicOfOOP_5.gift.sweets.Sweets;

public class Chocolate extends Sweets {
    public Chocolate(String name, int price, String shape, String taste) {
        super(name, price, shape, taste);
    }

    @Override
    public String toString() {
        return "Chocolate: " +
                "name = " + getName() +
                ", price = " + getPrice() + '$' +
                ", shape = " + getShape() +
                ", taste = " + getTaste();
    }
}
