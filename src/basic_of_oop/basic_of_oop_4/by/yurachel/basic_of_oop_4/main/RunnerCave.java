package basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.main;

import basic_of_oop.basic_of_oop_4.by.yurachel.basic_of_oop_4.entity.Cave;

import java.io.IOException;

public class RunnerCave {
    public static void main(String[] args) throws IOException {

        Cave c = new Cave();
        c.addTreasures();
//        c.showAllTreasures();
//        System.out.println("Most expensive treasure is: " + c.mostExpensive());
        c.treasuresWorth(5000);

        c.showMyTreasures();
    }
}
