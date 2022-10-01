package com.wayneyong.javacourse.exceptions;

/**
 * Custom Exception -
 * - Extend Exception Class
 */

class DataException extends Exception {
    public DataException(String reason) {
        super(reason);
    }
}

class InsufficientFundsException extends Exception {
}


class Account {
    private int acno;
    private double balance;

    public Account(int acno, double balance) {
        this.acno = acno;
        this.balance = balance;
    }

    /**
     * return 0 for success, 1 - insufficient funds, 2 -data error
     */
    public void withdraw(double amount) throws DataException, InsufficientFundsException {

        if (amount < 0) {
            throw new DataException("amount cannot be negative");
        }
        double newBalance = balance - amount;
        if (newBalance < 0) {
            throw new InsufficientFundsException();
        }
        //update the balance
        balance = newBalance;

    }
}


public class ExceptionHandlingEx3 {
    public static void main(String[] args) {

        Account acc1 = new Account(1, 1000);
        try {
            acc1.withdraw(1500);
            System.out.println("withdraw success");
        } catch (DataException e) {
            //handler for DataException
            System.out.println("failed with DataException");
            e.printStackTrace();
        } catch (InsufficientFundsException e) {
            //handler for InsufficientFundsException
            System.out.println("failed with InsufficientFundsException");
            e.printStackTrace();
        }
    }
}
