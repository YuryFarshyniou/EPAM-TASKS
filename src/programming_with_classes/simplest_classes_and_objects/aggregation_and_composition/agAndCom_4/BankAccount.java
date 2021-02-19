package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_4;

public class BankAccount {
    private long bankAccountName;
    private boolean isAvailable;
    private int amountOfMoney;

    public int getAmountOfMoney() {
        if(isAvailable){

            return amountOfMoney;
        }else{
            System.out.println("Your account is blocked.");
        }
        return 0;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public long getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(long bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {

        isAvailable = available;
    }

    public BankAccount(long bankAccountName, boolean isAvailable,int amountOfMoney) {
        this.bankAccountName = bankAccountName;
        this.isAvailable = isAvailable;
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankAccountName=" + bankAccountName +
                ", isAvailable=" + isAvailable +
                ", amountOfMoney=" + amountOfMoney +
                '}' ;
    }
}

