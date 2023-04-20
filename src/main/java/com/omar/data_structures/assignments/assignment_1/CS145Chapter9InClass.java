package com.omar.data_structures.assignments.assignment_1;

public class CS145Chapter9InClass {

    public static void main(String[] args) {
        Animal[] pets = new Animal[6];
        pets[0] = new Dog("Fred");
        pets[1] = new Dog("Ben");
        pets[2] = new Cat("Sue");
        pets[3] = new Cat("Julie");
        pets[4] = new Kitten("Maria");
        pets[5] = new Puppy("Lee");

        for (Animal pet : pets) {
            System.out.print(pet);
            System.out.println(" says " + pet.makeSound());
        }
    }
}

interface Animal {
    String makeSound();
}

class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String makeSound() {
        return "Woof";
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " the dog";
    }
}

class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String makeSound() {
        return "Purr";
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " the cat";
    }
}

class Kitten extends Cat {
    public Kitten(String name) {
        super(name);
    }

    public String toString() {
        return getName() + " the kitten";
    }
}

class Puppy extends Dog {
    public Puppy(String name) {
        super(name);
    }

    public String toString() {
        return getName() + " the puppy";
    }
}
