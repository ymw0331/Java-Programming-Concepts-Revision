package com.wayneyong.javacourse.interfaces;

import java.util.Scanner;

/**
 * Cohesion - Defines interaction between objects.
     * Low cohesion - BAD
     * High cohesion - GOOD
 * Coupling - Dependency among objects
     * Tight coupling - BAD
     * Loose coupling - GOOD
 * Interface for loosely coupled code
 * <p>
 * Clients will have to depend on interface instead of implementation, so when
 * there are changes, we can just change in the interface instead of making changees
 * in implementation.
 * Having common interface, will solve the different implementation when there are changes
 */
interface VideoPlayer {
    void play(String file);
}

class MP4Player implements VideoPlayer {
    @Override
    public void play(String file) {
        System.out.println("MP4Player playing the file - " + file);
    }
}

class MOVPlayer implements VideoPlayer {
    @Override
    public void play(String file) {
        System.out.println("MOVPlayer playing the file - " + file);
    }
}

class PlayerFactory {
    public static VideoPlayer getPlayer(String file) {
        if (file.endsWith("mp4")) {
            return new MP4Player(); //returning an interface
        }
        if (file.endsWith("mov")) {
            return new MOVPlayer();
        }
        return null;
    }
}


public class LooseCouplingEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which file you want to play?");
        String file = scan.nextLine();

        //Client
        VideoPlayer player = PlayerFactory.getPlayer(file);
        if (player == null) {
            System.out.println("Could not find a player for the given file");
        } else {
            player.play(file);
        }
    }
}
