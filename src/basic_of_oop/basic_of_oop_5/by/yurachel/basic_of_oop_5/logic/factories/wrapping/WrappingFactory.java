package basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.logic.factories.wrapping;

import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.wrapping.Wrapping;

public interface WrappingFactory {
    Wrapping createWrapping(String color,int price);
}
