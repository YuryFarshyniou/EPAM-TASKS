package basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.logic.factories.sweets;

import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.sweets.Sweets;
import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.sweets.chocolate.Chocolate;

public class ChocolateFactory implements SweetsFactory {
    @Override
    public Sweets createSweets(String name, int price, String shape, String taste) {
        return new Chocolate(name, price, shape, taste);
    }
}
