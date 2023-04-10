# Merge Sort

Merge sort is a popular sorting algorithm that uses the divide-and-conquer approach. It breaks down an unsorted array
into two halves, sorts each half recursively, and then merges the sorted halves back together to produce the final
sorted array. The key operation in the algorithm is the merging of two sorted arrays into a single sorted array.

Here's the pseudocode for merge sort:

````

function mergeSort(arr):
    if arr.length <= 1:
        return arr
        
    mid = arr.length / 2
    left = arr[0:mid]
    right = arr[mid:]
    left = mergeSort(left)
    right = mergeSort(right)
        
    return merge(left, right)

function merge(left, right):
    result = new empty array
    i = 0
    j = 0
    
    while i < left.length and j < right.length:
        if left[i] < right[j]:
            result.append(left[i])
            i++
        else:
            result.append(right[j])
            j++
    
    while i < left.length:
        result.append(left[i])
        i++
    
    while j < right.length:
        result.append(right[j])
        j++
    
    return result
````

Explanation:

The mergeSort function takes an unsorted array as input and recursively splits it into two halves until each subarray
has only one element. It then calls the merge function to merge the two sorted subarrays into a single sorted array. The
base case for the recursion is when the array has one or fewer elements, in which case it is already sorted. The merge
function takes two sorted arrays as input and merges them into a single sorted array. It initializes an empty array
result, and uses two pointers i and j to traverse the two input arrays. It compares the elements pointed to by i and j,
and appends the smaller element to result. The pointer for the smaller element is then incremented. The function
continues until one of the pointers reaches the end of its respective array. Finally, any remaining elements in the
non-empty array are appended to result. The sorted result array is returned to the calling function. The time complexity
of merge sort is O(n log n), where n is the size of the input array. This is because the array is recursively divided
into two halves until the base case is reached, and then the subarrays are merged back together in O(n) time.