package com.wayneyong.javacourse.packages;

//import com.wayneyong.javacourse.packages.demo.service.AccountService;
//import com.wayneyong.javacourse.packages.demo.service.CardService;
//import com.wayneyong.javacourse.packages.demo.service.*;

import com.wayneyong.javacourse.packages.demo.service.AccountService;
import com.wayneyong.javacourse.packages.demo.service.CardService;

import static com.wayneyong.javacourse.packages.demo.util.DateUtil.formatDate;
import static java.lang.System.out;

import java.util.Date;

/**
 * Packages -
 * Normal naming convention
 * reversedomain.project.module.classcategory....
 * Access modifier for class -
 * default - accessible only within the package
 * public - accessible outside package
 * Access modifier for members -
 * private - private to the class
 * default - package level access
 * protected - package level + derived level
 * public - accesible
 */

public class PackagesEx1 {
    public static void main(String[] args) {
//        com.wayneyong.javacourse.packages.demo.service.AccountService accountService =
//                new com.wayneyong.javacourse.packages.demo.service.AccountService();
//        accountService.openAccount();
//        com.wayneyong.javacourse.packages.demo.service.CardService cardService =
//                new com.wayneyong.javacourse.packages.demo.service.CardService();
//        cardService.newCard();
        AccountService accountService = new AccountService();
        accountService.openAccount();

        CardService cardService = new CardService();
        cardService.newCard();

//        System.out.println(DateUtil.formatDate(new Date()));
        out.println(formatDate(new Date()));


    }


}
