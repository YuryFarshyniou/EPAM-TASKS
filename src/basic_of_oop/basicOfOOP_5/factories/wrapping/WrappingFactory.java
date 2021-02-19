package basic_of_oop.basicOfOOP_5.factories.wrapping;

import basic_of_oop.basicOfOOP_5.gift.wrapping.Wrapping;

public interface WrappingFactory {
    Wrapping createWrapping(String color,int price);
}
