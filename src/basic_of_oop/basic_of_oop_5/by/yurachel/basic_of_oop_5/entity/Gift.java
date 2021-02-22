package basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity;

import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.sweets.Sweets;
import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.entity.wrapping.Wrapping;
import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.logic.factories.sweets.CandyFactory;
import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.logic.factories.sweets.ChocolateFactory;
import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.logic.factories.sweets.SweetsFactory;
import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.logic.factories.wrapping.BoxFactory;
import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.logic.factories.wrapping.WrappingFactory;
import basic_of_oop.basic_of_oop_5.by.yurachel.basic_of_oop_5.logic.factories.wrapping.WrappingPaperFactory;

import java.util.Objects;

public class Gift {
    private Wrapping wrapping;
    private Sweets sweets;
    private int price;

    public int getPrice() {
        return price;
    }


    public Wrapping getWrapping() {
        return wrapping;
    }

    public void setWrapping(Wrapping wrapping) {
        this.wrapping = wrapping;
    }

    public Sweets getSweets() {
        return sweets;
    }

    public void setSweets(Sweets sweets) {
        this.sweets = sweets;
    }


    // Выбираем сладости

    public void createCandies(String typeOfSweets, String sweetName, int sweetPrice, String sweetShape,
                              String sweetTaste) {

        SweetsFactory sweetsFactory = createSweets(typeOfSweets);
        this.sweets = sweetsFactory.createSweets(sweetName, sweetPrice, sweetShape, sweetTaste);
    }


    // Выбираем обертку.

    public void createWrapping(String wrappingType, String wrapColor, int wrapPrice) {
        WrappingFactory wrappingFactory = createWrapping(wrappingType);
        this.wrapping = wrappingFactory.createWrapping(wrapColor, wrapPrice);
    }


    // Выбираем,какие сладости хотим положить в подарок.

    SweetsFactory createSweets(String sweetsType) {
        if (sweetsType.equalsIgnoreCase("Candy")) {
            return new CandyFactory();
        } else if (sweetsType.equalsIgnoreCase("Chocolate")) {
            return new ChocolateFactory();
        }
        return null;
    }

    // Выбираем,какой оберткой хотим обернуть подарок.

    WrappingFactory createWrapping(String wrappingType) {
        if (wrappingType.equalsIgnoreCase("Box")) {
            return new BoxFactory();
        } else if (wrappingType.equalsIgnoreCase("Wrapping paper")) {
            return new WrappingPaperFactory();
        }
        return null;
    }

    // Вычисляем стоимость подарка.

    public void calculatePrice(){
        this.price = sweets.getPrice()+wrapping.getPrice();
    }

    // Подарок.

    public String toString() {
        return "Your gift: \n" +
                wrapping + '.' +
                "\n" + sweets +
                ".\nPrice = " + price + '.';
    }

    // Для проверки,одинаковые подарки или нет.

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gift gift = (Gift) o;
        return Objects.equals(wrapping, gift.wrapping) && Objects.equals(sweets, gift.sweets);
    }

    public int hashCode() {
        return Objects.hash(wrapping, sweets);
    }
}
