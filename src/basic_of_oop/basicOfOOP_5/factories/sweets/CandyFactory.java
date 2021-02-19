package basic_of_oop.basicOfOOP_5.factories.sweets;

import basic_of_oop.basicOfOOP_5.gift.sweets.Sweets;
import basic_of_oop.basicOfOOP_5.gift.sweets.candy.Candy;

public class CandyFactory implements SweetsFactory {
    @Override
    public Sweets createSweets(String name, int price, String shape, String taste) {

        return new Candy(name, price, shape, taste);
    }
}
