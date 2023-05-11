package com.omar.learn.cs145_new.exams.midterm1.oop;

/**
 * @author omar
 * @version 5/9/23
 */
public class OOPPractice {

    public static void main(String[] args) {

        Foo foo;
        Bar bar = new Bar();
        Baz baz = new Baz();
        Moo moo = new Moo();

        //(Foo) moo;
        //(Moo) baz;
        Foo[] a = new Bar[10];
        // (Moo) bar;
        //(Bar) baz;

        Alpha var1 = new Gamma();
        Beta var2 = new Delta();
        Alpha var3 = new Beta();
        Object var4 = new Beta();

        //not//var4.method1(); //will print Alpha 1 since var4 is a Beta reference.

        ((Beta) var4).method1(); //will print Alpha 1.

        //((Delta) var1).method1(); //will invoke method1() from the Delta class.

        //((Delta) var1).method1(); //will cause a casting error.

        ///var4.method1(); //will cause a compilation error.

        ((Beta) var4).method1(); //will cause a casting error.


        ((Delta) var2).method3(); //will cause a casting error.

        //((Delta) var2).method3(); //will print Delta 2.

        //((Gamma) var2).method3(); //will cause a casting error.

        //((Gamma) var2).method3(); //will invoke method3() from the Gamma class.

    }
}

class Foo {}

class Bar extends Foo {}

class Baz extends Foo {}

class Moo extends Baz {}

class Alpha {
    public void method1() {
        System.out.println("Alpha 1");
    }

    public void method2() {
        System.out.println("Alpha 2");
    }
}

class Gamma extends Beta {
    public void method1() {
        System.out.println("Gamma 1");
        super.method2();
    }

    public void method3() {
        System.out.println("Gamma 3");
    }
}

class Beta extends Alpha {
    public void method2() {
        System.out.println("Beta 2");
        super.method2();
    }
}

class Delta extends Beta {
   public void method2() {
       System.out.println("Delta 2");
    }

   public void method3() {
       method2();
       System.out.println("Delta 3");
   }
}
