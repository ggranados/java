# Insert Sort

Insertion sort is a simple sorting algorithm that works by iteratively building up a sorted sublist of elements. At each iteration, the algorithm selects an element from the unsorted part of the list and inserts it into the correct position in the sorted sublist.

Here are the steps for the insertion sort algorithm:

1. Start with an unsorted list of elements.
2. Iterate through the list, starting from the second element.
3. For each element, compare it with the elements before it in the sorted sublist.
4. If the current element is smaller than the previous element, swap them.
5. Repeat step 4 until the current element is in its correct position in the sorted sublist.

Continue iterating through the list until all elements are sorted.

Here's some pseudocode to help illustrate the algorithm:

```
for i = 1 to n-1
    j = i - 1
    while j > 0 and list[i] > list[j]
        swap list[j+1] and list[j]
        j = j --
```
In this pseudocode, list is the array of elements to be sorted, and n is the length of the array. The outer loop iterates through the unsorted part of the list, and the inner loop finds the correct position for the current element in the sorted sublist. 

Insertion sort has a time complexity of **O(n^2)** in the worst case, but it can be very efficient for small input sizes or nearly sorted input. It is also an in-place sorting algorithm, meaning it doesn't require any additional memory allocation beyond the original array.
