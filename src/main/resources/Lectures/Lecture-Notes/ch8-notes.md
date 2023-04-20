# OOP Review:
- Object: a thing that has state and behavior
- Class: a blueprint for an object
- Encapsulation: the idea that an object should contain all of the information and methods that are relevant to it

## Day 2:
- Implicit parameter:
    - The object on which the method is called
    - During `p1.findDistance()`, the object referred to by `p1` is the implicit parameter.
    - The instance method can refer to that object's fields.
        - We say that it executes in the context of a particular object.
        - `findDistance()` can refer to the `x` and `y` of the object it was called on.
```java
public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
public class Main {
  public static void main(String[] args) {
      // create two Point objects 
      Point p1 = new Point(0, 0);
      Point p2 = new Point(3, 4);

    // call a method on one object, passing in the other object as an argument
     double dist = p1.distance(p2);
     System.out.println(dist);
  }
}

```
- Accessor: A method that lets clients examine object state.
    - Examples: `distance()`, `distanceFromOrigin()`
    - Often has a non-void return type
- Mutator: A method that modifies an object's state.
    - Examples: `setLocation()`, `translate()`
```java
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Accessor method to get distance of this point from origin
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Accessor method to get distance of this point from another point
    public double distance(Point other) {
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Mutator method to set the location of this point
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Mutator method to translate this point by a given offset
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
```

## Day 3:
### Constructors
- A constructor is a special method that is called when an object is created.
- The constructor has the same name as the class.
- The constructor has no return type.
- The constructor is invoked with the `new` operator.

### Encapsulation
- Encapsulation: Hiding implementation details from clients.
    - Encapsulation forces abstraction.
    - Separates external view (behavior) from internal view (state)
    - Protects the integrity of an object's data
- The `this` keyword:
    - Refers to the implicit parameter inside your class (a variable that stores the object on which a method is called).
    - Can refer to a field: `this.field`.
    - Can call a method: `this.method(parameters)`.
    - One constructor `this(parameters)` can call another:
```java
public class Point {
    private int x;
    private int y;
    
    public Point() {
        this(0, 0); // calls the constructor with two int parameters
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
```

# Summary
- Object: a thing that has state and behavior
- Class: a blueprint for an object
- Encapsulation: the idea that an object should contain all of the information and methods that are relevant to it, and hide implementation details from clients
- Implicit parameter: the object on which a method is called, which can be referred to within the method using the this keyword
- Accessor: a method that lets clients examine object state, often with a non-void return type
- Mutator: a method that modifies an object's state
- Constructor: a special method that is called when an object is created, with the same name as the class and no return type
- The `this` keyword: refers to the implicit parameter inside a class, and can be used to refer to fields or call methods on the object it was called on

# Code Example:
```java
// Class definition
public class Point {
  // Fields
  private int x;
  private int y;

  // Constructor
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Accessor methods
  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public double distanceFromOrigin() {
    return Math.sqrt(this.x * this.x + this.y * this.y);
  }

  // Mutator methods
  public void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void translate(int dx, int dy) {
    this.x += dx;
    this.y += dy;
  }
}

```

# Exercises:
- [Exercise 1](



