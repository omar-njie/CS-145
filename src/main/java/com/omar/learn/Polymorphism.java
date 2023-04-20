package com.omar.learn;



/**
 * @author Omar
 * @version 9/29/22
 */
public class Polymorphism {

    public static void main(String[] args) {

        Employee anne = new Employee();
        Lawyer bob = new Lawyer();
        Employee carl = new Lawyer();

        System.out.println(anne.getHours());
        System.out.println(bob.getHours());
        System.out.println(carl.getHours());

        printEmployees(anne);


        First var1 = new Second();
        First var2 = new Third();
        First var3 = new Fourth();
        Second var4 = new Third();
        Object var5 = new Fourth();
        Object var6 = new Second();

        //var1.method2();
        //var2.method2();
        //var3.method2();
        //var4.method2();
        //var5.method2();
        //var6.method2();
        //var1.method3();
        ///var2.method3();
        //var3.method3();
        //var4.method3();
        //var5.method3();
        //var6.method3();

        System.out.println("++++++++++++++++++++++++++++++");
        //((Second) var4).method1(); // not working
        ((Third) var4).method1();
        System.out.println("++++++++++++++++++++++++++++++");
        // ((Second) var5).method2(); // ClassCastException
        ((First) var5).method3(); //
        System.out.println("++++++++++++++++++++++++++++++");
        // ((Third) var5).method1(); // ClassCastException
        ((First) var6).method3();
        // ((Second) var6).method1(); // not working
        ((Second) var6).method3();


    }

    static void printEmployees(Employee e) {
        System.out.println("This employee works " + e.getHours() + " hours per week.");
        System.out.println(" And uses the " + e.getVacationForm() + " vacation form.");
    }
}

class Employee {
    public String name;

    public int getVacation() {
        return 5;
    }

    public int getHours() {
        return 40;
    }

    public String getVacationForm() {
        return "Yellow";
    }
}

class Lawyer extends Employee {
    @Override
    public int getHours() {
        return 75;
    }
    @Override
    public String getVacationForm() {
        return "Green";
    }
}

class First {
    public void method2() {
        System.out.println("First2");
    }

    public void method3() {
        method2();
    }
}

class Second extends First {
    public void method2() {
        System.out.println("Second2");
    }
}


class Third extends Second {
    public void method1() {
        System.out.println("Third1");
        super.method2();
    }

    public void method2() {
        System.out.println("Third2");
    }
}

class Fourth extends First {
    public void method1() {
        System.out.println("Fourth1");
    }

    public void method2() {
        System.out.println("Fourth2");
    }
}
