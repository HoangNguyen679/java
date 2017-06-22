/**
 * Created by hoang on 13/02/2017.
 */
import javax.swing.JOptionPane;

public class Assignment {
    public static void main(String[] args){

        BankAccount DucHoang = new BankAccount();
        DucHoang.setAccountInfo("Nguyen Duc Hoang",10000000);
        DucHoang.deposit(1000000);
        DucHoang.display();

        DucHoang.setRate(0.05);
        DucHoang.updateMoney();
        DucHoang.display();

        BankAccount ThanhChinh = new BankAccount("Nguyen Thanh Chinh",10000000);
        ThanhChinh.display();

        ThanhChinh.setRate(0.04);
        ThanhChinh.display();

        DucHoang.display();

        DucHoang.debit(100000);
        DucHoang.updateMoney();
        DucHoang.display();
        /*
        String result = JOptionPane.showInputDialog("Hay nhap ten ban: ");
        JOptionPane.showMessageDialog(null, "Xin chao" + result + "!");
        */
    }
}
