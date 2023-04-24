package com.omar.data_structures.assignments.assignment_2.JavaCritter;

import java.awt.*;

/**
 * The Giant class represents a giant critter that always infects any other critter that is directly in front of it,
 * otherwise it always hops if the front cell is empty, or it turns right if it can't hop or infect.
 *
 * @author Omar
 * @version 4.23.23
 */
public class Giant extends Critter {

    private int move_count;

    /**
     * Constructor for the Giant class
     */
    public Giant() {
    }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }

    @Override
    public String toString() {
        if (move_count % 24 < 6) {
            return "fee";
        } else if (move_count % 24 < 12) {
            return "fie";
        } else if (move_count % 24 < 18) {
            return "foe";
        } else {
            return "fum";
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
            return Action.RIGHT;
        }
    }
}
