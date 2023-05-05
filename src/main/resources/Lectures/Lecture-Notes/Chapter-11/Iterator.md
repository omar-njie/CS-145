# Iterators

- Iterator: An object that allow a client to retrieve the elements of any collection without knowing the underlying implementation of the collection.
  - Remembers a position and lets you:
    - get the element at position
    - advance to the next position
    - remove the element at the current position

![img.png](iterator_img_ex.png)

### Iterator methods:
| Iterator Methods | Description                                                                                                             |
|------------------|-------------------------------------------------------------------------------------------------------------------------|
| `hasNext()`      | return `true` if there are more elements to examine                                                                     |
| `next()`         | returns the next element from the collection (throws a `NoSuchElementException` <br/>if there are none left to examine) |
| `remove()`       | removes the last value returned by next() (throws an `IllegalStateException` <br/>if you haven't called `next()` yet)   |

### Example with Sets:
```java
Set<Integer> scores = new TreeSet<>();
scores.add(28);
scores.add(82);
scores.add(98);
scores.add(73);
scores.add(57);

Iterator<Integer> itr = scores.iterator();
while (itr.hasNext()) {
    int score = itr.next();
    System.out.println("The score is " + 
    // eliminating any failing scores
    if (score < 60) {
        itr.remove();
    }
}
System.out.println(scores); // [73, 82, 98]
```

### Example with Maps:
```java
Map<String, Integer> scores2 = new HashMap<>();
scores2.put("Peter", 82);
scores2.put("Paul", 57);
scores2.put("Mary", 98);
scores2.put("Omar", 73);
scores2.put("Tim", 28);

Iterator<String> itr2 = scores2.keySet().iterator();
while (itr2.hasNext()) {
    String name = itr2.next();
    int score = scores2.get(name);
    System.out.println(name + " scored " + 
    // eliminating any failing scores
    if (score < 60) {
        itr2.remove();
    }
}
System.out.println(scores2); // {Mary=98, Peter=82, Omar=73}
```

