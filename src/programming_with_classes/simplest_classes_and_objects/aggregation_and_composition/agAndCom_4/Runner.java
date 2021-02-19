package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_4;


import java.io.IOException;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) throws IOException {
        ArrayList<Client> clients;
        ArrayList<BankAccount> firstClient;
        ArrayList<BankAccount> secondClient;
        ArrayList<BankAccount> thirdClient;
        ArrayList<BankAccount> fourthClient;
        ArrayList<BankAccount> fifthClient;


        Bank bank = new Bank("BelWeb", clients = new ArrayList<Client>());


        clients.add(new Client("Yura", firstClient = new ArrayList<BankAccount>()));
        clients.add(new Client("Misha", secondClient = new ArrayList<BankAccount>()));
        clients.add(new Client("Din", thirdClient = new ArrayList<BankAccount>()));
        clients.add(new Client("Sam", fourthClient = new ArrayList<BankAccount>()));
        clients.add(new Client("Gleb", fifthClient = new ArrayList<BankAccount>()));

        firstClient.add(new BankAccount(12345678,true,4500));
        firstClient.add(new BankAccount(56743953,false,120));

        secondClient.add(new BankAccount(93410236,true,2000));

        thirdClient.add(new BankAccount(71110412,true,5700));
        thirdClient.add(new BankAccount(39567214,false,200));

        fourthClient.add(new BankAccount(65126793,false,4130));

        fifthClient.add(new BankAccount(48560134,false,-1750));
        fifthClient.add(new BankAccount(84310002,false,-980));
        fifthClient.add(new BankAccount(20032012,true,-3200));

        // Блокировка разблокировка.

//        bank.unblockAccount();
//        bank.blockAccount();

        // Поиск счета.

//        bank.findingAccount();

        // Сортировка счетов.

//        bank.sortAccount();

        // Вычисление суммы по всем счетам.

//        bank.accountSum();

        // Вычисление общей суммы по счетам, имеющим положительный и отрицательный баланс отдельно.

//        bank.accountPosOrNegSum();


    }
}
