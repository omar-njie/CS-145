package com.omar.data_structures.assignments.assignment_2.JavaCritter;

import java.awt.*;

/**
 * The Bear class is a subclass of the {@link Critter} class.
 * It checks if the bear is polar bear or not.
 *
 * @author Omar
 * @version 4.23.23
 * @see Critter
 */
public class Bear extends Critter {

    private boolean polar;
    private int move_count;

    /**
     * Decide whether the bear is a normal bear or a polar bear
     * @param polar true if the bear is a polar bear
     */
    public Bear(boolean polar) {
        this.polar = polar;
        move_count = 0;
    }


    @Override
    public Color getColor() {
        return polar ? Color.WHITE : Color.BLACK;
    }

    @Override
    public String toString() {
        if (move_count % 2 == 0) {
            return "/";
        } else {
            return "\\";
        }
    }

    @Override
    public Action getMove(CritterInfo info) {
        move_count++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }
}
