# Java Collections

In Java, a collection is a group of objects that can be treated as a single entity. The Java Collections framework is a set of interfaces and classes that provide a standard way to handle collections of objects.

## Interfaces

### Collection Interface

The Collection interface is the root interface for all collections in the Java Collections framework. It provides the basic functionality that all collections should have, such as adding, removing, and iterating over elements.

### List Interface

The List interface extends the Collection interface and adds specific functionality for ordered collections. Lists allow duplicate elements and provide positional access to elements.

### Set Interface

The Set interface extends the Collection interface and adds specific functionality for collections that do not allow duplicate elements.

### Map Interface

The Map interface provides an object that maps keys to values. Maps do not allow duplicate keys.

## Classes

### ArrayList

The ArrayList class is an implementation of the List interface that uses an array to store elements. It provides dynamic resizing and fast positional access to elements.

### LinkedList

The LinkedList class is another implementation of the List interface that uses a linked list to store elements. It provides fast insertion and deletion, but slower positional access than ArrayList.

### HashSet

The HashSet class is an implementation of the Set interface that uses a hash table to store elements. It provides constant-time performance for basic operations

### HashMap

The HashMap class is an implementation of the Map interface that uses a hash table to store key-value pairs. It provides constant-time performance for basic operations, such as adding, removing, and searching.

### Iterators

Iterators are used to traverse collections in Java. All collection classes implement the Iterator interface, which provides methods for iterating over a collection.

### Generics

Generics allow you to create classes and methods that can work with different types of objects. They are used to ensure type safety at compile time.
Generics were introduced in Java 5 and provide type safety for collections. With generics, you can specify the type of elements that a collection can hold.

### Sorting

The Collections class provides static methods for sorting collections in Java. It provides a quicksort implementation for sorting lists and a mergesort implementation for sorting arrays.

### Comparators

The Comparator interface is used to compare objects in Java. It provides a single method, compare(), which takes two objects as parameters and returns an integer value based on the comparison.

### Streams

The Stream API was introduced in Java 8 and provides a way to process collections in a functional style. It allows you to perform operations on collections in a declarative way.

### Synchronization

Java collections are not thread-safe by default. To make a collection thread-safe, you can use the synchronized wrapper classes provided by the Collections class.

## Code Examples:

Creating a List:

```java
List<String> myList = new ArrayList<>(); // Create a new ArrayList
myList.add("apple"); // Add elements to the ArrayList
myList.add("banana");
myList.add("cherry");
System.out.println(myList); 
// Output: [apple, banana, cherry]
```

Creating a Set:

```java
Set<String> mySet = new HashSet<>(); // Create a new HashSet
mySet.add("apple"); // Add elements to the HashSet
mySet.add("banana");
mySet.add("cherry");
System.out.println(mySet);
// Output: [apple, banana, cherry]
```

Creating a Map:

```java
Map<String, Integer> myMap = new HashMap<>(); // Create a new HashMap
myMap.put("apple", 1); // Add elements to the HashMap
myMap.put("banana", 2);
myMap.put("cherry", 3);
System.out.println(myMap);
// Output: {apple=1, banana=2, cherry=3}
```

Iterating over a List:

```java
List<String> myList = new ArrayList<>(); // Create a new ArrayList
myList.add("apple"); // Add elements to the ArrayList
myList.add("banana");
myList.add("cherry");
for (String fruit : myList) { // Iterate over the ArrayList
    System.out.println(fruit);
}
// Output:
// apple
// banana
// cherry
```
Using the Iterator:

```java
List<String> myList = new ArrayList<>(); // Create a new ArrayList
myList.add("apple"); // Add elements to the ArrayList
myList.add("banana");
myList.add("cherry");
Iterator<String> iterator = myList.iterator(); // Get an iterator for the ArrayList
while (iterator.hasNext()) { // Iterate over the ArrayList
    String fruit = iterator.next();
    System.out.println(fruit);
}
// Output:
// apple
// banana
// cherry
```

Using the Stream API:

```java
List<String> myList = new ArrayList<>(); // Create a new ArrayList
myList.add("apple"); // Add elements to the ArrayList
myList.add("banana");
myList.add("cherry");
myList.stream() // Get a stream for the ArrayList
    .forEach(fruit -> System.out.println(fruit)); // Iterate over the stream
// Output:
// apple
// banana
// cherry
```
