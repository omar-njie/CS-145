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

        ArrayList<Employee> em = new ArrayList<>();
        em.add(new Employee("a", 1));
        em.add(new Employee("d", 0));
        em.add(new Employee("c", 7));
        em.add(new Employee("x", 4));
        em.add(new Employee("e", 5));
        System.out.println(em);
        Collections.sort(em);
        System.out.println(em);
    }
}
