package com.wayneyong.javacourse.inheritance;


class BasicCalc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

//IsA
class ScientificCalc extends BasicCalc {
    private static final double PI = 3.1416;
    public double sin(double deg) {
        double rad = deg * PI / 180;
        return Math.sin(rad);
    }
}

public class InheritanceEx4 {
    public static void main(String[] args) {
        test(new BasicCalc());
        System.out.println();
        test(new ScientificCalc());
    }

    static void test(BasicCalc calc) {
        System.out.println(calc.add(10, 20));
        System.out.println(calc.sub(10, 20));
        if (calc instanceof ScientificCalc) {
            System.out.println(((ScientificCalc) calc).sin(90));
        }
    }
}
