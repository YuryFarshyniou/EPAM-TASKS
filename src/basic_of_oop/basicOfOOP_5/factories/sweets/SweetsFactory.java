package basic_of_oop.basicOfOOP_5.factories.sweets;

import basic_of_oop.basicOfOOP_5.gift.sweets.Sweets;

public interface SweetsFactory {
    Sweets createSweets(String name,int price,String shape,String taste);
}
