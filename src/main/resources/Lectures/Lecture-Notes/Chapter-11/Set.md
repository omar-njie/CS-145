# Set in Java

A Set is a collection of unique values where duplicates are not allowed. It is represented by the `Set` interface in `java.util` package. A Set performs the following operations efficiently: add, remove, search (contains), size, isEmpty, clear, and equals. Sets do not have indexes, and elements are added to the Set without worrying about order.

## Set Implementation

In Java, there are three main implementations of the `Set` interface:

- `HashSet`
- `TreeSet`
- `LinkedHashSet`

### HashSet

A `HashSet` is implemented using a hash table array. It is very fast with O(1) time complexity for add, remove, and contains operations. `HashSet` does not store the elements in any particular order.

Example:

```java
Set<String> hashSet = new HashSet<>();
hashSet.add("apple");
hashSet.add("banana");
hashSet.add("orange");

System.out.println(hashSet.contains("apple")); // Output: true
System.out.println(hashSet.contains("grape")); // Output: false

hashSet.remove("banana");

System.out.println(hashSet); // Output: [orange, apple]
```

### TreeSet

A `TreeSet` is implemented using a binary search tree. It is pretty fast with O(log n) time complexity for add, remove, and contains operations. `TreeSet` stores the elements in sorted order.

Example:

```java
Set<String> treeSet = new TreeSet<>();
treeSet.add("apple");
treeSet.add("banana");
treeSet.add("orange");

System.out.println(treeSet.contains("apple")); // Output: true
System.out.println(treeSet.contains("grape")); // Output: false

treeSet.remove("banana");

System.out.println(treeSet); // Output: [apple, orange]
```

### LinkedHashSet

A `LinkedHashSet` is similar to `HashSet`, but it maintains the order of insertion. It is fast with O(1) time complexity for add, remove, and contains operations.

Example:

```java
Set<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("apple");
linkedHashSet.add("banana");
linkedHashSet.add("orange");

System.out.println(linkedHashSet.contains("apple")); // Output: true
System.out.println(linkedHashSet.contains("grape")); // Output: false

linkedHashSet.remove("banana");

System.out.println(linkedHashSet); // Output: [apple, orange]
```

### Conclusion

Sets are useful in situations where we need to store unique values and order does not matter. Depending on the use case, one of the three Set implementations can be chosen for optimal performance.

### Big-O Notation Definition
- O(1) - Constant Time
- O(n) - Linear Time
- O(n^2) - Quadratic Time
- O(log n) - Logarithmic Time
- O(n^3) - Cubic Time
- O(2^n) - Exponential Time
- O(n!) - Factorial Time
- O(n log n) - Linearithmic Time

## Set Operations

The following table shows the time complexity of the operations on a Set:

| Operation | HashSet | TreeSet  | LinkedHashSet |
|-----------|---------|----------|---------------|
| add       | O(1)    | O(log n) | O(1)          |
| remove    | O(1)    | O(log n) | O(1)          |
| contains  | O(1)    | O(log n) | O(1)          |
| size      | O(1)    | O(1)     | O(1)          |
| isEmpty   | O(1)    | O(1)     | O(1)          |
| clear     | O(1)    | O(1)     | O(1)          |
| equals    | O(n)    | O(n)     | O(n)          |


## References

- [Set (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/Set.html)
- [HashSet (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)
- [TreeSet (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html)
- [LinkedHashSet (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html)
- [Set (Java Collections)](https://www.javatpoint.com/java-set)
- [HashSet in Java](https://www.javatpoint.com/java-hashset)
- [TreeSet in Java](https://www.javatpoint.com/java-treeset)
- [LinkedHashSet in Java](https://www.javatpoint.com/java-linkedhashset)
- [Java Set Interface](https://www.geeksforgeeks.org/set-in-java/)
- [HashSet vs TreeSet vs LinkedHashSet in Java](https://www.geeksforgeeks.org/hashset-vs-treeset-vs-linkedhashset-java/)
- [Java Set Interface](https://www.geeksforgeeks.org/set-in-java/)
- [HashSet vs TreeSet vs LinkedHashSet in Java](https://www.geeksforgeeks.org/hashset-vs-treeset-vs-linkedhashset-java/)
