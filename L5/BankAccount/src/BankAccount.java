/**
 * Created by hoang on 13/02/2017.
 */

public class BankAccount {
  private String _name;
  private long _balance;
  private static double _rate ;
  //double _rate;
  static final double maxRate = 0.05;

  public BankAccount(){
    this._name = "NONAME";
    this._balance = 0;
    _rate = 0.01;
  }

  public BankAccount(String name, long balance){
    this._name = name;
    this._balance = balance;
  }

  public void display(){
    System.out.println(_name + " : " + _balance + " : " + _rate);
  }

  public void setAccountInfo(String name, long balance){
    this._name = name;
    this._balance = balance;
  }

  public void deposit(long money){
    _balance += money;
  }

  boolean debit(long amount){
    if(amount > _balance)
      return false;
    else {
      _balance -= amount;
      return true;
    }
  }

  static void setRate(double rate){
    _rate = rate;
  }

  public void updateMoney(){
    this._balance += (long)(this._balance * _rate);
  }
}
