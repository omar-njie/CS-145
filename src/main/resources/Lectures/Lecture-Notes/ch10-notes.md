| Methods                          | Description                                                                            |
|----------------------------------|----------------------------------------------------------------------------------------|
| `add(Object element)`            | Adds the specified element to the end of the list.                                     |
| `add(int index, Object element)` | Inserts the specified element at the specified position in the list.                   |
| `remove(int index)`              | Removes the element at the specified position in the list.                             |
| `remove(Object element)`         | Removes the first occurrence of the specified element from the list.                   |
| `get(int index)`                 | Returns the element at the specified position in the list.                             |
| `set(int index, Object element)` | Replaces the element at the specified position in the list with the specified element. |
| `indexOf(Object element)`        | Returns the index of the first occurrence of the specified element in the list.        |
| `lastIndexOf(Object element)`    | Returns the index of the last occurrence of the specified element in the list.         |
| `isEmpty()`                      | Returns true if the list contains no elements.                                         |
| `size()`                         | Returns the number of elements in the list.                                            |
| `clear()`                        | Removes all elements from the list.                                                    |
| `contains(Object element)`       | Returns true if the list contains the specified element.                               |
| `toArray()`                      | Returns an array containing all of the elements in the list in the correct order.      |

| Methods 2                      | Description                                                                             |
|--------------------------------|-----------------------------------------------------------------------------------------|
| `addAll(List list)`            | adds all elements from the given list to this list                                      |
| `addAll(int index, List list)` | adds all elements from the given list to this list                                      |
| `contains(Object value)`       | returns true if given value is found somewhere in this list                             |
| `containsAll(List list)`       | returns true if this list contains every element from given list                        |
| `equals(List list)`            | returns true if given other list contains the same elements                             |
| `iterator()`                   | returns an object used to examine the contents of the list (seen later)                 |
| `lastIndexOf(Object value)`    | returns last index value is found in list (-1 if not found)                             |
| `remove(Object value)`         | finds and removes the given value from this list                                        |
| `removeAll(List list)`         | removes any elements found in the given list from this list                             |
| `retainAll(List list)`         | removes any elements not found in given list from this list                             |
| `subList(int from, int to)`    | returns the sub-portion of the list between indexes from (inclusive) and to (exclusive) |
| `toArray()`                    | returns the elements in this list as an array                                           |

<p>
When working with ArrayLists problems, there are a few steps you can follow to help you solve the problem more effectively:

1. Understand the problem: Make sure you understand the problem statement and what is being asked of you. Identify the input and output requirements and any constraints or special conditions that need to be taken into account.
2. Plan your solution: Once you understand the problem, plan out how you will solve it. Break the problem down into smaller steps and identify the data structures and algorithms you will use.
3. Write your code: Using your plan as a guide, write your code. Make sure to use good coding practices such as proper naming conventions, commenting your code, and breaking your code into manageable functions.
4. Test your code: Once you have written your code, test it thoroughly to make sure it produces the expected output. Use a variety of test cases to check that your code works under different conditions.
Refine your code: If you encounter any issues or bugs during testing, refine your code to fix the problems. Look for ways to optimize your code and make it more efficient.
5. Document your code: Once your code is working correctly, document it so that others can understand how it works. Include comments, documentation, and instructions on how to use your code.

By following these steps, you can approach ArrayLists problems in a systematic and effective way, and increase your chances of solving the problem correctly and efficiently.
</p>

```java
    static void name(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.endsWith("s")) {
                list.remove(i);
                i--;
            }
        }
    }
```    
```java
    static void addStars(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i+=2) {
            String s = "*";
            list.add(i, s);
        }
    }
```

```java
    static void removeStars(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i+=2) {
            list.remove(i);
            i--;
        }
    }
```

```java
    static void swapPairs(ArrayList<String> list1, ArrayList<String> list2) {
        String[] words = {"four", "score", "and", "seven", "years", "ago"};
        String[] words2 = {"our", "fathers", "brought", "forth", "on", "this", "continent"};
        for (int i = 0; i < words.length; i++)
            list1.add(words[i]);
        for (int i = 0; i < words2.length; i++)
            list2.add(words2[i]);
        System.out.println(list1);
        System.out.println(list2);
    }
```
```java
    public static void removeEvenLength(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if (s.length() % 2 == 0) {
                strings.remove(i);
                i--;
            }
        }
    }
```
