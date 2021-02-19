package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Client> clients;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public Bank(String bankName, ArrayList<Client> clients) {
        this.bankName = bankName;
        this.clients = clients;
    }

    // Блокировка счета.

    public void blockAccount() throws IOException {
        System.out.println("Enter name of bank account:");
        reader = new BufferedReader(new InputStreamReader(System.in));
        long bankAccountName = Long.parseLong(reader.readLine());
        boolean isExist = false;
        for (Client client : clients) {
            for (BankAccount account : client.getBankAccounts()) {
                if (account.getBankAccountName() == bankAccountName && account.isAvailable()) {
                    account.setAvailable(false);
                    System.out.println("This account blocked");
                    isExist = true;
                } else if (account.getBankAccountName() == bankAccountName && !account.isAvailable()) {
                    System.out.println("This account is already blocked.");
                    isExist = true;
                }
            }
        }
        if (!isExist) System.out.println("We can't find account.");
    }

    // Разблокировка счета.

    public void unblockAccount() throws IOException {
        System.out.println("Enter name of bank account:");
        reader = new BufferedReader(new InputStreamReader(System.in));
        long bankAccountName = Long.parseLong(reader.readLine());
        boolean isExist = false;
        for (Client client : clients) {
            for (BankAccount account : client.getBankAccounts()) {
                if (account.getBankAccountName() == bankAccountName && !account.isAvailable()) {
                    account.setAvailable(true);
                    System.out.println("This account unblocked.");
                    isExist = true;
                } else if (account.getBankAccountName() == bankAccountName && account.isAvailable()) {
                    System.out.println("This account is already unblocked.");
                    isExist = true;
                }
            }
        }
        if (!isExist) System.out.println("We can't find account.");
    }

    // Поиск счета.

    public void findingAccount() throws IOException {
        System.out.println("Enter name of bank account:");
        reader = new BufferedReader(new InputStreamReader(System.in));
        long bankAccountName = Long.parseLong(reader.readLine());
        boolean isExist = false;
        for (Client client : clients) {
            for (BankAccount account : client.getBankAccounts()) {
                if (account.getBankAccountName() == bankAccountName) {
                    isExist = true;
                    System.out.println("Owner " + client.getName() + " and his account " + account);
                }
            }
        }
        if (!isExist) System.out.println("We can't find account.");
    }

    // Сортировка счетов.

    public void sortAccount() throws IOException {
        System.out.println("Enter client name of the bank :");
        reader = new BufferedReader(new InputStreamReader(System.in));
        String clientName = reader.readLine();
        boolean isExist = false;
        for (Client client : clients) {
            if (clientName.equalsIgnoreCase(client.getName())) {
                isExist = true;
                System.out.println("Current client account: \n" + client);
                System.out.println("You want sor by money,available or account number? (m//a//an)");
                String firstAnswer = reader.readLine();

                // Сортируем по количеству денег.

                if (firstAnswer.equalsIgnoreCase("m")) {
                    System.out.println("Do you want to sort by amount of money to ascending or descending order?(a//d)");
                    String answer = reader.readLine();
                    if (answer.equalsIgnoreCase("a")) {
                        client.ascendingSortMoney();
                        System.out.println(client);
                    } else if (answer.equalsIgnoreCase("d")) {
                        client.descendingSortMoney();
                        System.out.println(client);
                    } else {
                        System.out.println("Wrong answer.");
                    }

                    // Сортируем по блокировке, разблокировке счета.

                } else if (firstAnswer.equalsIgnoreCase("a")) {
                    System.out.println("Do you want to sort by available to blocked or unblocked order?(b//u)");
                    String answer = reader.readLine();
                    if (answer.equals("b")) {
                        client.blockedSortAvailable();
                        System.out.println(client);
                    } else if (answer.equals("u")) {
                        client.unblockedSortAvailable();
                        System.out.println(client);
                    } else {
                        System.out.println("Wrong answer");
                    }
                } else if (firstAnswer.equalsIgnoreCase("an")) {
                    System.out.println("Do you want to sort by amount of money to ascending or descending order?(a//d)");
                    String answer = reader.readLine();
                    if (answer.equalsIgnoreCase("a")) {
                        client.ascendingSortAccount();
                        System.out.println(client);
                    } else if (answer.equalsIgnoreCase("d")) {
                        client.descendingSortAccount();
                        System.out.println(client);
                    } else {
                        System.out.println("Wrong answer.");
                    }
                }
            }
        }

        if (!isExist) System.out.println("We can't find a client.");
    }

    // Вычисление общей суммы по счетам.

    public void accountSum() throws IOException {
        System.out.println("Enter customer's name: ");
        String customerName = reader.readLine();
        boolean isExist = false;
        int sum = 0;
        String s = "";
        for (Client client : clients) {
            if (client.getName().equalsIgnoreCase(customerName)) {
                s = client.getName();
                isExist = true;
                for (BankAccount account : client.getBankAccounts()) {
                    sum += account.getAmountOfMoney();
                }
            }
        }
        if (isExist) {
            System.out.println(s + "'s common sum in all his accounts is: " + sum + "$.");
        } else {
            System.out.println("Can't find this customer.");
        }
    }

    // Вычисление общей суммы по счетам, имеющим положительный и отрицательный баланс отдельно.

    public void accountPosOrNegSum() throws IOException {
        System.out.println("Enter customer's name: ");
        String customerName = reader.readLine();
        boolean isExist = false;
        int positiveSum = 0;
        int countP = 0;
        int negativeSum = 0;
        int countN = 0;
        String s = "";
        for (Client client : clients) {
            if (client.getName().equalsIgnoreCase(customerName)) {
                s = client.getName();
                isExist = true;
                for (BankAccount account : client.getBankAccounts()) {
                    if (account.getAmountOfMoney() > 0) {
                        positiveSum += account.getAmountOfMoney();
                        countP++;
                    } else if (account.getAmountOfMoney() < 0) {
                        negativeSum -= account.getAmountOfMoney();
                        countN++;
                    }
                }

            }
        }
        if (isExist) {
            if (countP > 0 && countN == 0) {
                System.out.println(s + "'s common positive sum in all his accounts is: " + positiveSum + "$.");
            } else if (countP > 0 && countN > 0) {
                System.out.println(s + "'s common positive sum in all his accounts is: " + positiveSum + "$." +
                        "and negative sum in all his accounts is: " + negativeSum + "$.");
            }else if(countP == 0 && countN > 0){
                System.out.println(s + "'s common negative sum in all his accounts is: " + negativeSum + "$.");
            }
        } else {
            System.out.println("Can't find this customer.");
        }
    }


    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", clients=" + clients +
                '}';
    }
}
