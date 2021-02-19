package basic_of_oop.basicOfOOP_4.factories.random;

import basic_of_oop.basicOfOOP_4.factories.TreasureFactory;
import basic_of_oop.basicOfOOP_4.treasure.Treasure;

import java.util.Random;

public class RandomFactories implements TreasureFactory {
    TreasureFactory[] factories;
    Random r = new Random();

    public RandomFactories(TreasureFactory[]factories){
        this.factories = factories;
    }

    @Override
    public Treasure create() {
        int num = r.nextInt(factories.length);
        return factories[num].create();
    }
}
