package basic_of_oop.basicOfOOP_5;

import basic_of_oop.basicOfOOP_5.gift.Gift;

import java.io.IOException;

public class RunnerGift {
    public static void main(String[] args) throws IOException {
        Gift gift = new Gift();
        gift.createGift();
        System.out.println(gift);

        Gift gift2 = new Gift();
        gift2.createGift();
        System.out.println(gift2);

        System.out.println(gift.equals(gift2));
    }
}
