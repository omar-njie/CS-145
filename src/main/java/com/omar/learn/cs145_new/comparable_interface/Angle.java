package com.omar.learn.cs145_new.comparable_interface;

/**
 * @author omar
 * @version 5/19/23
 */
public class Angle implements Comparable<Angle> {
    private int degrees;
    private int minutes;

    public Angle(int degrees, int minutes) {
        this.degrees = degrees;
        this.minutes = minutes;
    }

    public int getDegrees() {
        return degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public String toString() {
        return degrees + " d, " + minutes + " m";
    }


    @Override
    public int compareTo(Angle o) {
        if (degrees != o.degrees) {
            return degrees - o.degrees;
        } else {
            return minutes - o.minutes;
        }
    }
}
