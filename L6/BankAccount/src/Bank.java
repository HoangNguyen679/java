import java.util.*;

/**
 * Created by hoang on 06/03/2017.
 */
public class Bank {
  //BankAccount[] listAccount;

  Vector listAccount = new Vector();

  public void add(BankAccount bAcc){
    listAccount.addElement(new BankAccount(bAcc));
  }

  public void printAllAccount(){
    for (int i = 0; i < listAccount.size(); i++) {

    }
  }

  public long caculateTotalBAlance(){
    long total;
    for (BankAccount tmp:listAccount) {
      total += tmp.getBalance();
    }

    return total;
  }
}
