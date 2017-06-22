/**
 * Created by hoang on 13/02/2017.
 */

import javax.swing.JOptionPane;

public class Assignment {
    public static void main(String[] args){

        BankAccount DucHoang = new BankAccount();
        DucHoang.setAccountInfo("Nguyen Duc Hoang",10000000);
        DucHoang.deposit(1000000, "VND");
        DucHoang.display();

        BankAccount QuocViet = new BankAccount("Nguyen Quoc Viet", 10000000);
        BankAccount ThanhChinh = new BankAccount("Nguyen Thanh Chinh", 10000000);

        Bank ViettinBank = new Bank();
        ViettinBank.add(DucHoang);
        ViettinBank.add(QuocViet);
        ViettinBank.add(ThanhChinh);

        ViettinBank.printAllAccount();


        /*
        String result = JOptionPane.showInputDialog("Hay nhap ten ban: ");
        JOptionPane.showMessageDialog(null, "Xin chao" + result + "!");
        */
    }
}
