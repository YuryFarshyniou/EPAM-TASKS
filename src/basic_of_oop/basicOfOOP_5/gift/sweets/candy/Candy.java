package basic_of_oop.basicOfOOP_5.gift.sweets.candy;

import basic_of_oop.basicOfOOP_5.gift.sweets.Sweets;

public class Candy extends Sweets {

    public Candy(String name, int price, String shape, String taste) {
        super(name, price, shape, taste);
    }

    @Override
    public String toString() {
        return "Candy: " +
                "name = " + getName() +
                ", price = " + getPrice() + '$' +
                ", shape = " + getShape() +
                ", taste = " + getTaste();
    }
}
