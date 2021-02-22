package basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.logic.factories.sweets;

import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.sweets.Sweets;

public interface SweetsFactory {
    Sweets createSweets(String name,int price,String shape,String taste);
}
