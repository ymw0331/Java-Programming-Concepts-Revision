package com.wayneyong.javacourse.packages.demo.service;

import java.util.UUID;

//Visibility only within the package
public class AccountInternalService {
    public String generalAccountID() {
        return UUID.randomUUID().toString();
    }

}
