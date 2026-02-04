# algo project for DSA Data Structures And Algorithms

           ███╗░░░███╗░█████╗░███╗░░██╗██╗░░░██╗███████╗██╗░░░░░
           ████╗░████║██╔══██╗████╗░██║██║░░░██║██╔════╝██║░░░░░
           ██╔████╔██║███████║██╔██╗██║██║░░░██║█████╗░░██║░░░░░
           ██║╚██╔╝██║██╔══██║██║╚████║██║░░░██║██╔══╝░░██║░░░░░
           ██║░╚═╝░██║██║░░██║██║░╚███║╚██████╔╝███████╗███████╗
           ╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚══╝░╚═════╝░╚══════╝╚══════╝

Algorithms repository is use to define and implement algorithms in different languages

[See Study Notes](https://mgallegoa.github.io/notes.html)

## Common patterns

1. Prefix Sum: Sum of the array in the same array. arr[i] += arr[i - 1]
2. Two Pointers: use two pointers to process.
3. Slice windows: use a windows to sum or other. windowSum = windowSum - arr[i - (i - numWindowK)]
4. Slow Pointer: Middle of the array or Circle linked List
5. (Reversal) Linked List In-Place Reversal: Use three pointers, example reverse linked list, use Previous, Current and Next pointers.
6. xxxxx Monotonic Stack: NextGraterElement.java
7. Top K elements: Using Min-Heap or Max-Heap (see Quickselect)
8. Overlapping intervals: Margin Intervals (MergeIntervals.java) and Intervals Intersection.
9. Modified Binary Search: Rotated Sorted Array
10. Traverse Binary Tree: Pre-Order(copy of the tree), In-Order(values in sorted order), Post-Order (process the child before the root), Level by Level order.
11. Depth-First Search DFS: Graphs or Tree
12. Breath-First Search BFS: Graphs or Tree. To find shortes path
13. Matrix Traversal: using DFS or BFS to solve problems
14. Backtracking: Generate all possibles subsets. Example permutations, combinations, Sudoku, N-queens problem. Find all possibles paths in a graph. Generate all valid parenthesis in a given number.
15. Dynamic Programming DP: Fibonacci Numbers, 0/1 knapsack, Longest Common Sub-sequence (LCS), Longest Increasing Sub-sequence (LCS), Subset Sum, Matrix Chain Multiplication

## Algorithms

1. Sum of numbers -> 001_SumNumbers.md
2. Polynomial time complexity analysis --> 002_Polynomial.md
3. Singly Array List --> java/README.md

## Implementations:

1. Java implementations --> ./java/README.md
