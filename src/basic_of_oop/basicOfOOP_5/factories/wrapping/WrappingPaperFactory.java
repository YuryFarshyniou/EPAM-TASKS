package basic_of_oop.basicOfOOP_5.factories.wrapping;

import basic_of_oop.basicOfOOP_5.gift.wrapping.Wrapping;
import basic_of_oop.basicOfOOP_5.gift.wrapping.wrappingpaper.WrappingPaper;

public class WrappingPaperFactory implements WrappingFactory {
    @Override
    public Wrapping createWrapping(String color, int price) {
        return new WrappingPaper(color, price);
    }
}
