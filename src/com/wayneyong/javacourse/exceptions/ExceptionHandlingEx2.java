package com.wayneyong.javacourse.exceptions;

/**
 * Custom Exceptions -
 * - Extend Exception class
 */

class AccountOld {
    private int acno;
    private double balance;

    public AccountOld(int acno, double balance) {
        this.acno = acno;
        this.balance = balance;
    }

    /**
     * return 0 for success, 1 - insufficient funds, 2 -data error
     */
    public Status withdraw(double amount) {
        if (amount <= 0) {
            return Status.DATA_ERROR;
        }
        double newBalance = balance - amount;
        if (newBalance > 0) {
            balance = newBalance;
            return Status.SUCCESS;
        }
        return Status.INSUFFICIENT_FUNDS;
    }
}

enum Status {
    SUCCESS,
    INSUFFICIENT_FUNDS,
    DATA_ERROR
}

public class ExceptionHandlingEx2 {
    public static void main(String[] args) {

        AccountOld acc1 = new AccountOld(1, 1000);
        Status withdrawStatus = acc1.withdraw(500);
        switch (withdrawStatus) {
            case SUCCESS:
                System.out.println("withdraw success");
                break;
            case DATA_ERROR:
                System.out.println("failed with data error");
                break;
            case INSUFFICIENT_FUNDS:
                System.out.println("failed with insufficient fund");
                break;
        }
    }
}
