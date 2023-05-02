# Inheritance

Inheritance is a feature in object-oriented programming that enables a new class to be built upon an existing class, inheriting its properties and methods. The existing class is called the parent or superclass, and the new class is called the child or subclass.

The subclass can inherit all the non-private methods and properties of the superclass, can add new methods or properties, and can override existing ones. The subclass can also call the superclass methods using the "super" keyword.

### Example:
```java
public class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Woof!
    }
}
```
In this example, the Dog class is a subclass of the Animal class. It inherits the makeSound method from the Animal class and overrides it with its own implementation.

# Polymorphism

Polymorphism is the ability of an object to take on many forms. In Java, polymorphism allows you to write code that can work with objects of different classes, as long as those classes are related by inheritance or interface implementation. There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism.

Compile-time polymorphism is also called method overloading. It allows you to define multiple methods with the same name in a class, as long as they have different parameter types or number of parameters.

Runtime polymorphism is also called method overriding. It allows a subclass to provide a specific implementation of a method that is already provided by its superclass.

### Example:
```java
public class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
```
In this example, the Shape class is a superclass of the Circle and Square classes. The Circle and Square classes override the draw method with their own implementation. The shapes array contains objects of both classes, and the draw method is called on each object, demonstrating runtime polymorphism.

# Casting

Casting is the process of converting an object from one type to another. In Java, casting can be either upcasting or downcasting.

Upcasting is when you cast an object of a subclass to its superclass type. This is always safe and can be done implicitly.

Downcasting is when you cast an object of a superclass to its subclass type. This is potentially unsafe and requires an explicit cast.

### Example:
```java
public class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound(); // Output: Animal is making a sound
        ((Dog) myAnimal).bark(); // Downcasting
    }
}
```
In this example, an object of the Dog class is upcast to the Animal class, which is always safe. Then, the makeSound method is called on the Animal object, demonstrating polymorphism. Finally, the Animal object is downcast to the Dog class, which requires an explicit cast.