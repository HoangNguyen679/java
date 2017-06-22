/**
 * Created by hoang on 13/03/2017.
 */
public class SavingAccount extends BankAccount {
  private int interest;

  public SavingAccount(String name, long balance){
    super(name,balance);
    interest = 5;
  }
  public void updateBalance(){
    long balance;
    deposit(this.getBalance()*interest/100, "VND");
  }
}
