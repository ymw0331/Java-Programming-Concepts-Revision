package com.wayneyong.javacourse.initializers;

import java.util.Properties;


class Config {
    static Properties props;

    static {
        System.out.println("loading the properties from configuration file");
        props = new Properties();
    }
}

//Any logic that is specific to one time activity can be pushed
//into static initializer

class DatabaseDriver {
    //done only once
    static {
        System.out.println("establish database connection");
    }
}

public class InitializerEx2 {
    public static void main(String[] args) {


    }
}
