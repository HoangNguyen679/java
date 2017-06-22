/**
 * Created by hoang on 13/02/2017.
 */

public class BankAccount {
    String name;
    long balance;

    void display(){
        System.out.println(name + " : " + balance);
    }

    void setAccountInfo(String name, long balance){
        this.name = name;
        this.balance = balance;
    }

    void deposit(long money){
        balance += money;
    }

    boolean debit(long amount){
        if(amount > balance)
            return false;
        else {
            balance -= amount;
            return true;
        }
    }
}
