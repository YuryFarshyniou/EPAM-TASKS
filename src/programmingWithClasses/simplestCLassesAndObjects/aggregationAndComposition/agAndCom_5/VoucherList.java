package programmingWithClasses.simplestCLassesAndObjects.aggregationAndComposition.agAndCom_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VoucherList {
    ArrayList<Voucher>voucherList = new ArrayList<>();
    ArrayList<Voucher>newVoucherList = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void addVouchers(){
        voucherList.add(new Voucher("Rest","Airplane","Yes",15,1200));
        voucherList.add(new Voucher("Excursion","Bus","Yes",5,240));
        voucherList.add(new Voucher("Rest","Airplane","Yes",10,800));
        voucherList.add(new Voucher("Excursion","Train","No",7,320));
        voucherList.add(new Voucher("Treatment","Bus","Yes",14,900));
        voucherList.add(new Voucher("Rest","Bus","Yes",7,520));
        voucherList.add(new Voucher("Excursion","Bus","No",5,200));
        voucherList.add(new Voucher("Rest","Airplane","Yes",10,900));
        voucherList.add(new Voucher("Treatment","Airplane","Yes",7,550));
        voucherList.add(new Voucher("Rest","Train","Yes",10,640));
        voucherList.add(new Voucher("Excursion","Airplane","Yes",10,510));
        voucherList.add(new Voucher("Rest","Train","Yes",9,560));
        voucherList.add(new Voucher("Shopping","Airplane","All inclusive",10,600));
        voucherList.add(new Voucher("Treatment","Bus","No",2,100));
        voucherList.add(new Voucher("Excursion","Train","Yes",12,640));
        voucherList.add(new Voucher("Shopping","Bus","No",2,120));
        voucherList.add(new Voucher("Shopping","Train","No",3,200));
        voucherList.add(new Voucher("Shopping","Bus","No",3,180));
        voucherList.add(new Voucher("Rest","Bus","Yes",13,870));
        voucherList.add(new Voucher("Rest","Bus","Yes",7,4220));
        voucherList.add(new Voucher("Cruise","Ship","Yes",9,1560));
        voucherList.add(new Voucher("Cruise","Ship","Yes",5,1199));
    }

    public void sort() throws IOException {
        System.out.println("Our agency can offer you next types of services: Rest, Excursion, Treatment, Cruise, Shopping.");
        System.out.println("What do you want to chose?");
        String answer = reader.readLine();
        for(Voucher voucher: this.voucherList){

        }

    }

}
