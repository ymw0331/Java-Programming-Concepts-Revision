package com.wayneyong.javacourse.abstractclasses;

/**
 * Problem statement -
 * Graphic
 * fields: x1,y1,x2,y2
 * methods: setStart() - sets x1, y1
 * setEnd() - sets x2, y2
 * draw() - an abstract method
 * <p>
 * Line extends Graphic -
 * overrides draw() - prints "draw line from (x1,y1) to (x2,y2)
 * Rectangle extends Graphic -
 * overrides draw() - prints "draw rectangle from (x1, y1) to (x2, y2)
 */

abstract class Graphic {
    //common functionalities as utility
    protected int x1, x2, y1, y2;

    public void setStart(int x, int y) {
        this.x1 = x;
        this.y1 = y;
    }

    public void setEnd(int x, int y) {
        this.x2 = x;
        this.y2 = y;
    }

    //either let the subclass to override, make it abstract, otherwise provide default implementation to let them override
    public abstract void draw();//provide an empty definition, subclass will be able to override
//    public void draw() {}
}

class Line extends Graphic {

    @Override
    public void draw() {
        System.out.printf("draw line from (\"%d\",\"%d\") to (\"%d\",\"%d\")", x1, y1, x2, y2);
    }
}

class Rectangle extends Graphic {
    @Override
    public void draw() {
        System.out.printf("draw rectangle from (\"%d\",\"%d\") to (\"%d\",\"%d\")", x1, y1, x2, y2);
    }
}

public class AbstractClassEx4 {

    //applicable to all subclass of Graphic
    static void drawShape(int x1, int y1, int x2, int y2, Graphic g) {
        g.setStart(x1, y1);
        g.setEnd(x2, y2);
        g.draw();
    }

    public static void main(String[] args) {
//        Line l1 = new Line();
//        l1.setStart(10, 10);
//        l1.setEnd(20, 20);
//        l1.draw();
//        System.out.println();
//        Rectangle r1 = new Rectangle();
//        r1.setStart(10, 20);
//        r1.setEnd(20, 30);
//        r1.draw();


        drawShape(10, 10, 20, 20, new Line());
        System.out.println();
        drawShape(10, 10, 20, 20, new Rectangle());
    }
}
