# Recursion

## Definition:
Recursion is a programming technique where a function calls itself, either directly or indirectly. This allows for
problems that can be broken down into smaller subproblems to be solved more efficiently.

In general, a recursive function has two parts: a base case and a recursive case. The base case is the condition under
which the function stops calling itself and returns a value. The recursive case is where the function calls itself with
a smaller version of the original problem until it eventually reaches the base case.

## Example:

```python
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)
```

In this example, the base case is when n is equal to 0, at which point the function returns 1. The recursive case
multiplies n by the result of calling the factorial function with n - 1.

It's important to note that recursive functions can lead to infinite loops if the base case is not defined correctly or
if the recursive case does not eventually reach the base case. Additionally, recursive functions can be less efficient
than non-recursive functions if the function makes too many recursive calls, leading to a large number of function call
overheads.

That being said, recursion is a powerful tool for solving certain types of problems, such as those involving tree or
graph structures. By breaking down the problem into smaller subproblems, it can simplify complex algorithms and make
them easier to understand and maintain.

## Recursion ans cases
- Every recursive algorithm involves at least 2 cases:
  - base case: A simple occurrence that can be answered directly.
  - recursive case: A more complex occurrence of the problem that cannot be directly answered, but can instead be 
    described in terms of smaller occurrences of the same problem.
  
- Some recursive algorithms have more than one base or recursive
case, but all have at least one of each.
- A crucial part of recursive programming is identifying these cases.

## Recursion vs Iteration

Recursion and iteration are two ways to achieve repetition in programming. Recursion is when a function calls itself.
Iteration is when a loop repeats until a condition is met.

## Example:

```java
public class Main {
    static void printStars(int n) {
        if (n == 1) {
            // base case just end the line of output
            System.out.println();
        } else {
            // recursive case print one more star
            System.out.println("*");
            printStars(n - 1);
        }
    }
}
```
```java
import java.util.*;

public class RecursionExample {

    public static void main(String[] args) {
        // Example of using recursion to sum a list of integers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int sum = sumList(nums);
        System.out.println("Sum of list: " + sum);

        // Example of using recursion to find all subsets of a set
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        List<Set<Integer>> subsets = findAllSubsets(set);
        System.out.println("All subsets of set " + set + ": " + subsets);

        // Example of using recursion to calculate a Fibonacci sequence
        int n = 6;
        int fibonacci = calculateFibonacci(n);
        System.out.println("Fibonacci sequence of " + n + ": " + fibonacci);
    }

    // Recursive method to sum a list of integers
    public static int sumList(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            int head = list.get(0);
            List<Integer> tail = list.subList(1, list.size());
            return head + sumList(tail);
        }
    }

    // Recursive method to find all subsets of a set
    public static List<Set<Integer>> findAllSubsets(Set<Integer> set) {
        if (set.isEmpty()) {
            List<Set<Integer>> subsets = new ArrayList<>();
            subsets.add(new HashSet<>());
            return subsets;
        } else {
            int element = set.iterator().next();
            set.remove(element);
            List<Set<Integer>> subsets = findAllSubsets(set);
            List<Set<Integer>> newSubsets = new ArrayList<>();
            for (Set<Integer> subset : subsets) {
                Set<Integer> newSubset = new HashSet<>(subset);
                newSubset.add(element);
                newSubsets.add(newSubset);
            }
            subsets.addAll(newSubsets);
            return subsets;
        }
    }

    // Recursive method to calculate a Fibonacci sequence
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}
```

In this example, we have three recursive methods that use the Collections framework.

The sumList method takes a list of integers and recursively adds up all the elements in the list. It does this by
checking if the list is empty, and if so, it returns 0. Otherwise, it adds the first element of the list to the result
of recursively calling itself with the rest of the list.

The findAllSubsets method takes a set of integers and recursively finds all the subsets of the set. It does this by
checking if the set is empty, and if so, it returns a list with an empty set as the only element. Otherwise, it removes
an element from the set, recursively calls itself with the remaining set, and generates new subsets by adding the
removed element to each subset generated from the recursive call.

The calculateFibonacci method takes an integer n and recursively calculates the nth Fibonacci number. It does this by
checking if n is less than or equal to 1, and if so, it returns n. Otherwise, it recursively calls itself with n-1 and
n-2 and adds the results together.

These examples illustrate how recursion can be used in conjunction with the

