package basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.sweets.candy;

import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.sweets.Sweets;

public class Candy extends Sweets {

    public Candy(String name, int price, String shape, String taste) {
        super(name, price, shape, taste);
    }


    public String toString() {
        return "Candy: " +
                "name = " + getName() +
                ", price = " + getPrice() + '$' +
                ", shape = " + getShape() +
                ", taste = " + getTaste();
    }
}
