/**
 * Created by hoang on 13/02/2017.
 */

public class BankAccount {
    String name;
    private long _balance;
    private static double _rate ;
    //double _rate;
    static final double maxRate = 0.05;

    public BankAccount(){
        this.name = "NONAME";
        this._balance = 0;
        _rate = 0.01;
    }

    public void display(){
        System.out.println(name + " : " + _balance + " : " + _rate);
    }

    void setAccountInfo(String name, long balance){
        this.name = name;
        this._balance = balance;
    }

    void deposit(long money){
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

    void updateMoney(){
        this._balance += (long)(this._balance * _rate);
    }
}
