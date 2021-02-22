package basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.logic.factories.wrapping;

import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.wrapping.Wrapping;
import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.wrapping.box.Box;

public class BoxFactory implements WrappingFactory {
    @Override
    public Wrapping createWrapping(String color, int price) {
        return new Box(color, price);
    }
}
