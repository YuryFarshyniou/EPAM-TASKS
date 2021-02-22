package basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity;

import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.TreasureFactory;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.armor.ArmorFactory;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.gem.GemFactory;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.random.RandomFactories;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.scroll.ScrollFactory;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.logic.factories.sword.SwordFactory;
import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.treasure.Treasure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cave {
    private Map<Integer, Treasure> treasuresWorthList;
    private List<Treasure> treasuresList;

    {
        treasuresWorthList = new HashMap<>();
        treasuresList = new ArrayList<>();
    }

    public Map<Integer, Treasure> getTreasuresWorthList() {
        return treasuresWorthList;
    }

    public void setTreasuresWorthList(Map<Integer, Treasure> treasuresWorthList) {
        this.treasuresWorthList = treasuresWorthList;
    }

    public List<Treasure> getTreasuresList() {
        return treasuresList;
    }

    public void setTreasuresList(List<Treasure> treasuresList) {
        this.treasuresList = treasuresList;
    }

    // Добавляем сокровища в список.

    public void addTreasures() {
        RandomFactories r = new RandomFactories(new TreasureFactory[]{
                new ArmorFactory(), new GemFactory(), new SwordFactory(),
                new ScrollFactory()
        });
        for (int i = 0; i < 100; i++) {
            Treasure treasure = r.create();
            treasuresList.add(treasure);
        }
    }

    // Выводим все сокровища.

    public void showAllTreasures() {
        for (Treasure treasures : treasuresList) {
            System.out.println(treasures);
        }
    }

    // Выбор самого дорогого по стоимости сокровища.

    public Treasure mostExpensive() {

        Treasure expensive = null;
        int price = Integer.MIN_VALUE;
        for (int i = 0; i < treasuresList.size(); i++) {
            if (treasuresList.get(i).getPrice() > price) {
                price = treasuresList.get(i).getPrice();
                expensive = treasuresList.get(i);
            }
        }
        return expensive;
    }

    // Выбор сокровищ на заданную сумму.

    public void treasuresWorth(int sum) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int indexForMyTreasureWorthList = 1;

        // Пока сумма не закончится, и  размер списка сокровищ не станет равен 0.

        while (true) {
            Map<Integer, Treasure> treasuresMap = new HashMap<>();
            int keyForTreasureMap = 1;
            for (Treasure treasure : this.treasuresList) {
                if (treasure.getPrice() < sum) {
                    treasuresMap.put(keyForTreasureMap, treasure);
                    keyForTreasureMap++;
                }
            }
            if (treasuresMap.size() == 0) {
                break;
            } else {

                // Выводим список доступных сокровищ на консоль.

                System.out.println("Sum is " + sum + ":");
                for (Map.Entry treasure : treasuresMap.entrySet()) {
                    System.out.println(treasure.getKey() + " " + treasure.getValue());
                }
                System.out.println("Enter treasure number: ");
                int number = Integer.parseInt(reader.readLine());
                this.treasuresWorthList.put(indexForMyTreasureWorthList, treasuresMap.get(number)); // Добавляем сокровища в список сокровищ на заданную сумму.
                this.treasuresList.remove(treasuresMap.get(number));  // Удаляем сокровище из списка сокровищ для избежания дублирования.
                indexForMyTreasureWorthList++;
                sum -= treasuresMap.get(number).getPrice();
            }
        }

    }

    // Выводим выбранные сокровища.

    public void showMyTreasures() {
        System.out.println("Our treasures list: ");
        for (Map.Entry treasure : treasuresWorthList.entrySet()) {
            System.out.println(treasure.getKey() + " " + treasure.getValue());
        }
    }

}


