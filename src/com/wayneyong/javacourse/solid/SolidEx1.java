package com.wayneyong.javacourse.solid;

/**
 * SOLID Principles -
 * SOLID is an acronym for the first five object-oriented design (ODD)
 * principles by Robert C. Martin
 * <p>
 * <p>
 * S - Single Responsibility Principle (A class should have one and only one reason to change)
 * Each class should be responsible for a single part of functionality of the system
 * <p>
 * <p>
 * O - Open-Closed Principle
 * Software components should be open for extension, but not for modification
 * <p>
 * <p>
 * L - Liskov Substitution Principle
 * Objects of superclass should be replaceable with objects of its subclass without breaking the system
 * <p>
 * <p>
 * I - Interface Segregation Principle
 * No client should be forced to depend on methods that it does not use
 * <p>
 * <p>
 * D - Dependency Inversion Principle
 * High-level modules should not depend on low-level modules, both should depend on abstractions
 */

class AccountService {
    AccountRepository repository = new AccountRepository();
    NotificationService notificationService = new NotificationService();
    public void openAccount() {
        //SOLID, a class should be given one responsibility at a time
        //1
        System.out.println("fill account internal details");

        repository.create();

        notificationService.sendNotification();

        //2, completely diff job (database)
//        System.out.println("store account object in database");
        //3, sending out notification (email?sms?or what?)
//        System.out.println("send out welcome message");
    }
}

class AccountRepository {
    public void create() {
        //2
        System.out.println("store account object in database");
    }
}

class NotificationService {
    public void sendNotification() {
        //3
        System.out.println("send out welcome message");
    }
}

public class SolidEx1 {
    public static void main(String[] args) {

        AccountService service = new AccountService();
        service.openAccount();
    }
}
