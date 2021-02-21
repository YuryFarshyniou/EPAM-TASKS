package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_4.by.yurachel.ag_and_com_4.entity;

import java.math.BigInteger;
import java.util.Objects;

public class BankAccount {
    private BigInteger bankAccountName;
    private boolean isAvailable;
    private int amountOfMoney;

    public int getAmountOfMoney() {
        if (isAvailable) {

            return amountOfMoney;
        } else {
            System.out.println("Your account is blocked.");
        }
        return 0;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public BigInteger getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(BigInteger bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {

        isAvailable = available;
    }

    public BankAccount(BigInteger bankAccountName, boolean isAvailable, int amountOfMoney) {
        this.bankAccountName = bankAccountName;
        this.isAvailable = isAvailable;
        this.amountOfMoney = amountOfMoney;
    }

    public String toString() {
        return "BankAccount's information. " + "bankAccountName: " + bankAccountName.toString() +
                ", isAvailable: " + isAvailable + ", amountOfMoney: " + amountOfMoney + "\n";
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return isAvailable == that.isAvailable && amountOfMoney == that.amountOfMoney && Objects.equals(bankAccountName, that.bankAccountName);
    }

    public int hashCode() {
        return Objects.hash(bankAccountName, isAvailable, amountOfMoney);
    }
}

