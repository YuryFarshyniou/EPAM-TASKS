package basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.armor;

import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.TreasureFactory;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.Treasure;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.armors.Armor;

import java.util.Random;

public class ArmorFactory implements TreasureFactory {



    public Treasure create() {
        String []adjective = {"Magic", "Powerful", "Divine", "Incredible"};
        String [] adjective2 = {"Iron", "Bronze", "Silver", "Leather"};
        Random r = new Random();
        String firstAdjective = adjective[r.nextInt(adjective.length-1) ];
        String secondAdjective2 = adjective2[r.nextInt(adjective2.length-1) ];

        return new Armor(r.nextInt(9000) , firstAdjective + " " + secondAdjective2 +  " Armor");
    }
}
