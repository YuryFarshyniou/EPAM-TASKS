package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_4.by.yurachel.ag_and_com_4.main;


import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_4.by.yurachel.ag_and_com_4.entity.Bank;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_4.by.yurachel.ag_and_com_4.entity.BankAccount;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_4.by.yurachel.ag_and_com_4.entity.Client;

import java.io.IOException;
import java.math.BigInteger;

public class Runner {
    public static void main(String[] args) throws IOException {

        Bank bank = new Bank("BelGazPromBank");

        // Добавляем клиентов.

        bank.addNewClient(new Client("Yura", "Farshineiu"));
        bank.addNewClient(new Client("Misha", "Collins"));
        bank.addNewClient(new Client("Din", "Winchester"));
        bank.addNewClient(new Client("Sam", "Winchester"));
        bank.addNewClient(new Client("Gleb", "Savitskiy"));

        // Создаем для клиентов счета.

        bank.searchClient("Yura", "Farshineiu").addBankAccount(new BankAccount(new BigInteger("123456789"), true, 5000));
        bank.searchClient("Yura", "Farshineiu").addBankAccount(new BankAccount(new BigInteger("677654444"), true, -300));
        bank.searchClient("Yura", "Farshineiu").addBankAccount(new BankAccount(new BigInteger("222313134"), true, -220));
        bank.searchClient("Misha", "Collins").addBankAccount(new BankAccount(new BigInteger("546332456"), true, 3222));
        bank.searchClient("Din", "Winchester").addBankAccount(new BankAccount(new BigInteger("900567453"), true, 1700));
        bank.searchClient("Sam", "Winchester").addBankAccount(new BankAccount(new BigInteger("1235674572"), true, 800));
        bank.searchClient("Gleb", "Savitskiy").addBankAccount(new BankAccount(new BigInteger("546456322"), true, 4000));

        // Пример сортировки.

//        bank.searchClient("Yura","Farshineiu").descendingSortMoney();
//        System.out.println(bank.searchClient("Yura","Farshineiu").getBankAccounts());

        // Вычисление суммы по всем счетам.

//        System.out.println( bank.accountSum("Yura","Farshineiu"));

        // Поиск счета.

//        System.out.println(bank.findingAccount(new BigInteger("546332456")));

        // Поиск суммы по счетам , имеющиим положительный и отрицательный баланс отдельно.

//        System.out.println(bank.accountNegSum("Yura", "Farshineiu"));
//        System.out.println(bank.accountPosSum("Yura", "Farshineiu"));

        // Блокировка счета.

        bank.blockAccount(new BigInteger("123456789"));
        System.out.println( bank.findingAccount(new BigInteger("123456789")).getAmountOfMoney());
    }
}
