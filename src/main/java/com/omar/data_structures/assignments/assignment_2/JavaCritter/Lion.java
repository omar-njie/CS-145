package com.omar.data_structures.assignments.assignment_2.JavaCritter;

import java.awt.*;

/**
 * The Lion class is a subclass of the {@link Critter} class.
 * It assigns the lion a random color for every three moves.
 *
 * @author Omar
 * @version 10.5.22
 * @see Critter
 */
public class Lion extends Critter {

    private int move_count;

    /**
     * Creates a lion object.
     */
    public Lion() {
    }

    @Override
    public Color getColor() {
        int random_color = move_count / 3 % 3;
        return switch (random_color) {
            case 0 -> Color.RED;
            case 1 -> Color.GREEN;
            case 2 -> Color.BLUE;
            default -> null;
        };
    }

    @Override
    public String toString() {
        return "L";
    }

    @Override
    public Action getMove(CritterInfo info) {
        move_count++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (Neighbor.WALL == info.getFront()
                || Neighbor.WALL == info.getRight()) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
