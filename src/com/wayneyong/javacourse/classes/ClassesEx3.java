package com.wayneyong.javacourse.classes;

/**
 * Classes -
 * class {  data + operations }
 *
 * + data hiding - restrict direct acess from data
 * + encapsulation - use combine of data and operation
 */

class Account {

    //data
    private double balance;

    //operations
    public void withdraw(double amount) {
        if ((balance - amount) > 0) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
public class ClassesEx3 {

    public static void main(String[] args) {

        Account acc1 = new Account();

        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.withdraw(1000);
        acc1.deposit(-9000);

//        acc1.balance = -99999999; //error

        System.out.println(acc1.getBalance());
    }
}
