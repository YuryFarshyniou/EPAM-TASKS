package basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.random;

import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.TreasureFactory;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.Treasure;

import java.util.Random;

public class RandomFactories implements TreasureFactory {
    TreasureFactory[] factories;
    Random r = new Random();

    public RandomFactories(TreasureFactory[]factories){
        this.factories = factories;
    }


    public Treasure create() {
        int num = r.nextInt(factories.length);
        return factories[num].create();
    }
}
