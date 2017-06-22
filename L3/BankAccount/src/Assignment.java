/**
 * Created by hoang on 13/02/2017.
 */
import javax.swing.JOptionPane;

public class Assignment {
    public static void main(String[] args){
        BankAccount DucHoang = new BankAccount();
        DucHoang.setAccountInfo("Nguyen Duc Hoang",10000000);
        DucHoang.display();

        DucHoang.deposit(1000000);
        DucHoang.display();

        String result = JOptionPane.showInputDialog("Hay nhap ten ban: ");
        JOptionPane.showMessageDialog(null, "Xin chao" + result + "!");

    }
}
