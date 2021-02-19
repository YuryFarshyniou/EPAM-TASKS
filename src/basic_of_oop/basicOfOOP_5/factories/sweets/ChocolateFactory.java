package basic_of_oop.basicOfOOP_5.factories.sweets;

import basic_of_oop.basicOfOOP_5.gift.sweets.Sweets;
import basic_of_oop.basicOfOOP_5.gift.sweets.chocolate.Chocolate;

public class ChocolateFactory implements SweetsFactory {
    @Override
    public Sweets createSweets(String name, int price, String shape, String taste) {
        return new Chocolate(name, price, shape, taste);
    }
}
