package basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.logic.factories.sweets;

import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.sweets.Sweets;
import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.sweets.candy.Candy;

public class CandyFactory implements SweetsFactory {
    @Override
    public Sweets createSweets(String name, int price, String shape, String taste) {

        return new Candy(name, price, shape, taste);
    }
}
