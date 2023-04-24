package com.omar.data_structures.assignments.assignment_2.JavaCritter;

import java.awt.*;
import java.util.Random;

/**
 * <p>The Gator class is a type of Critter that has a randomly generated color and changes its appearance
 * depending on its hunger level. It infects other Critters in front of it and hops on empty spaces.
 * If there are no empty spaces, it turns right.</p>
 *
 * @author Omar
 * @version 4/23/23
 * @see Critter
 */
public class Gator extends Critter {

    private int hunger;
    private Color color;

    public Gator() {
    }

    private Color get_random_color() {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        return new Color(r, g, b);
    }

    @Override
    public Color getColor() {
        if (color == null)
            color = get_random_color();
        return color;
    }

    @Override
    public String toString() {
        if (hunger < 5) {
            return "g";
        } else if (hunger < 10) {
            return "G";
        } else if (hunger < 15) {
            return "GG";
        } else {
            return "GGG";
        }
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            hunger++;
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            hunger--;
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }

}
