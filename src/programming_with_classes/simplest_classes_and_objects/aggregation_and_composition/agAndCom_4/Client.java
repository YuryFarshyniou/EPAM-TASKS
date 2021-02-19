package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_4;


import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_4.comparator.*;

import java.util.ArrayList;

public class Client {
    private String name;
    private ArrayList<BankAccount> bankAccounts;
    AscendingSortMoney as = new AscendingSortMoney();
    DescendingSortMoney ds = new DescendingSortMoney();
    BooleanSort bsb = new BooleanSort();
    BooleanSortUnblocked bsu = new BooleanSortUnblocked();
    AscendingAccountSort aas = new AscendingAccountSort();
    DescendingAccountSort das = new DescendingAccountSort();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public Client(String name, ArrayList<BankAccount> bankAccounts) {
        this.name = name;
        this.bankAccounts = bankAccounts;
    }



    // Сортировка счетов.

    public void ascendingSortMoney() {
   this.bankAccounts.sort(as);

    }
    public void descendingSortMoney() {
        this.bankAccounts.sort(ds);
    }
    public void blockedSortAvailable() {
        this.bankAccounts.sort(bsb);
    }
    public void unblockedSortAvailable() {
        this.bankAccounts.sort(bsu);
    }
    public void ascendingSortAccount() {
        this.bankAccounts.sort(aas);

    }
    public void descendingSortAccount() {
        this.bankAccounts.sort(das);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", bankAccounts=" + bankAccounts +
                '}';
    }
}
