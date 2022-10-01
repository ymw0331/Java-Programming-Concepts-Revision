package com.wayneyong.javacourse.enums;

//enum with value
enum Color {
    //Color RED = new Color();
    RED("#ff000"),
    GREEN("#00ff00"),
    BLUE("#000ff");
    String code;

    Color(String code) { //constructor
        this.code = code;
    }

    public String getCode() { //exposing method
        return this.code;
    }
}

public class EnumEx2 {
    static void print(Color color) {
        System.out.println("Printing the code - " + color);
        System.out.println("Using the code - " + color.getCode());
    }

    public static void main(String[] args) {
        print(Color.RED);

        //cannot instantiate other than predefined 3 enum states
        //Color color = new Color("pqr");

        Color color = Color.valueOf("GREEN");
        print(color);
    }
}
