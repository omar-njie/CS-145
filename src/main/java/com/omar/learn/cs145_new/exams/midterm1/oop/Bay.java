package com.omar.learn.cs145_new.exams.midterm1.oop;

public class Bay extends Lake {
    public void method1() {
        System.out.println("Bay1");
        super.method2();
    }

    public void method2() {

        System.out.println("Bay2");
    }
}