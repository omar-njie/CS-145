package com.omar.data_structures.assignments.assignment_2.JavaCritter;

// This defines a simple class of critters that sit around waiting to be
// taken over by other critters.

import java.awt.*;

public class Food extends Critter {
    public Critter.Action getMove(CritterInfo info) {
        return Critter.Action.INFECT;
    }

    public Color getColor() {
        return Color.GREEN;
    }

    public String toString() {
        return "F";
    }
}
