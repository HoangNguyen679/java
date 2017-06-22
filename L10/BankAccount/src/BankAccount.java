/**
 * Created by hoang on 13/02/2017.
 */

public class BankAccount {
  private String _name;
  private long _balance;

  public BankAccount() {
    this._name = "NONAME";
    this._balance = 0;
  }

  public BankAccount(BankAccount bAcc){
    this._name = bAcc.getName();
    this._balance = bAcc.getBalance();
  }

  public BankAccount(String name, long balance) {
    this._name = name;
    this._balance = balance;
  }

  public void display() {
    System.out.println(_name + " : " + _balance);
  }

  public void setAccountInfo(String name, long balance) {
    this._name = name;
    this._balance = balance;
  }

  public void deposit(long money, String currency) {
    if (money > 0) {
      switch (currency) {
        case "VND":
          _balance += money;
          break;
        case "USD":
          _balance += money * 22000;
          break;
        case "EUR":
          _balance += money * 24000;
          break;
        case "JPY":
          _balance += money * 00200;
          break;
        case "GBP":
          _balance += money * 28000;
          break;
        case "RUP":
          _balance += money * 00360;
          break;
        case "SGD":
          _balance += money * 16000;
          break;
      }
    }
  }

  public boolean debit(long amount, String currency) {
    if (amount > 0) {
      switch (currency) {
        case "VND":
          if (amount < _balance)
            _balance -= amount;
          return true;
        case "USD":
          if (amount * 22000 < _balance)
            _balance -= amount * 22000;
          return true;
        case "EUR":
          if (amount * 24000 < _balance)
            _balance -= amount * 24000;
          return true;
        case "JPY":
          if (amount * 00200 < _balance)
            _balance -= amount * 00200;
          return true;
        case "GBP":
          if (amount * 28000 < _balance)
            _balance -= amount * 28000;
          return true;
        case "RUP":
          if (amount * 00360 < _balance)
            _balance -= amount * 00360;
          return true;
        case "SGD":
          if (amount * 16000 < _balance)
            _balance -= amount * 16000;
          return true;
        default: return false;
      }
    }
    return false;
  }

  public long getBalance(){
    return _balance;
  }

  public String getName() {
    return _name;
  }

}
