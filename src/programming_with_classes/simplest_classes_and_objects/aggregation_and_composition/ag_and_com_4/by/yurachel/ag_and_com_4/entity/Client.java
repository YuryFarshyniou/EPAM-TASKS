package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_4.by.yurachel.ag_and_com_4.entity;


import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String lastName;
    private List<BankAccount> bankAccounts;

    {
        bankAccounts = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public Client(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    // Добавить счет в банке.

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    // Сортировка счетов.

    public void ascendingSortMoney() {
        this.bankAccounts.sort((bankAccounts1, bankAccounts2) -> bankAccounts1.getAmountOfMoney() - bankAccounts2.getAmountOfMoney());
    }

    public void descendingSortMoney() {
        this.bankAccounts.sort((bankAccounts1, bankAccounts2) -> bankAccounts2.getAmountOfMoney() - bankAccounts1.getAmountOfMoney());
    }

    public void blockedSortAvailable() {
        this.bankAccounts.sort((bankAccounts1, bankAccounts2) -> Boolean.toString(bankAccounts1.isAvailable()).compareTo(Boolean.toString(bankAccounts2.isAvailable())));

    }

    public void unblockedSortAvailable() {
        this.bankAccounts.sort((bankAccounts1, bankAccounts2) -> Boolean.toString(bankAccounts2.isAvailable()).compareTo(Boolean.toString(bankAccounts1.isAvailable())));

    }

    public void ascendingSortAccount() {
        this.bankAccounts.sort((bankAccounts1, bankAccounts2) -> bankAccounts1.getBankAccountName().compareTo(bankAccounts2.getBankAccountName()));
    }

    public void descendingSortAccount() {
        this.bankAccounts.sort((bankAccounts1, bankAccounts2) -> bankAccounts2.getBankAccountName().compareTo(bankAccounts1.getBankAccountName()));
    }

    public String toString() {
        return "Client. " + "name: " + name + ".\nbankAccounts: " + bankAccounts;
    }
}
