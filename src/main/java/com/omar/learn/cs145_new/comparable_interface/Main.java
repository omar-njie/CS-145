package com.omar.learn.cs145_new.comparable_interface;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author omar
 * @version 5/19/23
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Angle> angles = new ArrayList<>();
        angles.add(new Angle(34, 19));
        angles.add(new Angle(34, 2));
        angles.add(new Angle(34, 54));
        angles.add(new Angle(34, 30));
        angles.add(new Angle(14, 59));
        angles.add(new Angle(4, 55));
        System.out.println(angles);
        Collections.sort(angles);
        System.out.println(angles);
    }
}
