/**
 * Created by hoang on 13/02/2017.
 */

public class Assignment {
    public static void main(String[] args){

        BankAccount DucHoang = new BankAccount();
        DucHoang.setAccountInfo("Nguyen Duc Hoang",10000000);
        DucHoang.deposit(1000000, "VND");
        //DucHoang.display();

        BankAccount QuocViet = new BankAccount("Nguyen Quoc Viet", 10000000);
        BankAccount ThanhChinh = new BankAccount("Nguyen Thanh Chinh", 10000000);

        Bank ViettinBank = new Bank();
        ViettinBank.add(DucHoang);
        ViettinBank.add(QuocViet);
        ViettinBank.add(ThanhChinh);

        ViettinBank.printAllAccount();
        System.out.println("Tong tai khoan ngan hang :" + ViettinBank.caculateTotalBalance());

        SavingAccount fox = new SavingAccount("Lovely Fox", 1000000);
        fox.display();
        fox.updateBalance();
        fox.display();

    }
}
