package com.wayneyong.javacourse.enums;

/**
 * Enum type -
 * A special data type enables for a variable to be set
 * of predefined constants.
 * <p>
 * e.g.
 * enum Day{
 * SUNDAY, MONDAY, .....
 * }
 */
//
//interface State {
//    int STOPPED = 0;
//    int STARTING = 1;
//    int STARTED = 2;
//}
//
//class Machine {
//    public void setState(int state) {
//        this.state = state;
//    }
//    private int state = State.STOPPED; // Storing integer is not good, scope is still not limited
//    public int getState() {
//        //validation needed
//        return this.state;
//    }
//}

enum State {
    //sets of values, boundaries are clearer, no more integers
    STOPPED, STARTING, STARTED;
}

class Machine {
    public State state = State.STOPPED;
    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return this.state;
    }
}

public class EnumEx1 {
    public static void main(String[] args) {
        Machine m1 = new Machine();
        m1.setState(State.STARTING);
        System.out.println(m1.getState()); // 1
    }
}
