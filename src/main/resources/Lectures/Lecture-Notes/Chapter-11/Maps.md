# Maps
- **Map**: Holds a set of unique keys and a collection of values, where each key is
       associated with one value.
---
### basic map operations:
  - put(key, value): adds a mapping from key to value
  - get(key): returns the value associated with key
  - containsKey(key): returns true if key is in the map
  - remove(key): removes the given key and its mapped value
---
### Map Implementation:
  - In Java, maps are represented by the Map interface in java.util
  - Map is implemented by HashMap, TreeMap, and LinkedHashMap

- HashMap: implemented using a hash table array;
           extremely fast: O(1) for put, get, and containsKey (All operations)
           elements are stored in unpredictable order

- TreeMap: implemented using a binary search tree;
           very fast: O(log n) for put, get, and containsKey (All operations)
           elements are stored in sorted order. Alphabetical or by numerical value

- LinkedHashMap: O(1) but stores in order of insertion

### Map Example
```java
 Map<String, Integer> map = new HashMap<>();
        map.put("Omar", 1);
        map.put("Tim", 2);
        map.put("ff", 3);
        map.put("dd", 4);
        System.out.println(map); // {ff=3, Tim=2, Omar=1, dd=4}

        Map<String, Integer> IDs = new TreeMap<>();
        IDs.put("Omar", 1);
        IDs.put("Tim", 2);
        IDs.put("ff", 3);
        IDs.put("dd", 4);
        IDs.put("bb", 5);
        IDs.put("aa", 6);
        System.out.println(IDs); // {Omar=1, Tim=2, aa=6, bb=5, dd=4, ff=3}

        Map<String, Set<Integer>> map_set = new HashMap<>();
        map_set.put("Omar", Set.of(1, 2, 3));
        map_set.put("Tim", Set.of(4, 5, 6));
        System.out.println(map_set); // {Tim=[4, 5, 6], Omar=[1, 2, 3]}
```
---
## Map Methods:

| Map Methods      | Description                                |
|------------------|--------------------------------------------|
| put(key, value)  | adds a mapping from key to value           |
| get(key)         | returns the value associated with key      |
| containsKey(key) | returns true if key is in the map          |
| remove(key)      | removes the given key and its mapped value |
| clear()          | removes all mappings                       |
| size()           | returns the number of mappings             |
| isEmpty()        | returns true if there are no mappings      |
| toString()       | returns a string representation of the map |

| Map Methods | Description                                           |
|-------------|-------------------------------------------------------|
| keySet()    | returns a set of all keys                             |
| values()    | returns a collection of all values                    |
| putAll(map) | adds all mappings from map to this map                |
| equals(map) | returns true if map has the same mappings as this map |
| hashCode()  | returns a hash code for the map                       |
| entrySet()  | returns a set of all key-value pairs                  |


## Using Maps
- A map allows you to get from one half of a pair to the other.
- Remembers one piece of information about every index (key).
  ```
  put("Marty", "206-685-2181")
  ```
- KeySet and values
  - keySet() returns a set of all keys in the map
    - can loop over the keys in a for-each loop
    - can get each key's associated value by calling on the map
  - values() returns a collection of all values in the map
    - can loop over the values in a for-each loop
    - no easy to get from a value to its associated key(s)

## Going through a map
```java
Map<String, Integer> ages = new HashMap<>();
    ages.put("Marty", 19);
    ages.put("Stuart", 44);
    ages.put("Peter", 2);
    ages.put("Kevin", 20);  
    
    for (String name : ages.keySet()) {
        int age = ages.get(name);
        System.out.println(name + " -> " + age);
    }
```

## Changing a map
```java
 Map<String, Integer> ages2 = new HashMap<>();
     ages2.put("Marty", 19);
     ages2.put("Stuart", 44);
     ages2.put("Peter", 2);
     ages2.put("Kevin", 20);

     for (String name : ages2.keySet()) {
         int age = ages2.get(name);
         ages2.put(name, age + 10);
     }
     System.out.println(ages2);// {Peter=12, Marty=29, Kevin=30, Stuart=54}
```