package basic_of_oop.basicOfOOP_5.factories.wrapping;

import basic_of_oop.basicOfOOP_5.gift.wrapping.Wrapping;
import basic_of_oop.basicOfOOP_5.gift.wrapping.box.Box;

public class BoxFactory implements WrappingFactory {
    @Override
    public Wrapping createWrapping(String color, int price) {
        return new Box(color, price);
    }
}
