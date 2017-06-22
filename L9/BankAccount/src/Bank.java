import java.util.*;

/**
 * Created by hoang on 06/03/2017.
 */
public class Bank {

  private ArrayList<BankAccount> listAccount = new ArrayList<>();
  private long totalBalance_;

  public void add(BankAccount bankAccount){
    listAccount.add(bankAccount);
  }

  public void printAllAccount(){
    System.out.println("List of Customer: ");
    for (BankAccount bankAccount : listAccount) {
        bankAccount.display();
    }
  }

  public long caculateTotalBalance(){
    long total = 0;
    for (BankAccount bankAccount : listAccount) {
      total += bankAccount.getBalance();
    }
    return total;
  }
}
