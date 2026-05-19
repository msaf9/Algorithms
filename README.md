# Algorithms

## Birds eye view
```tree
Beginner Path
├── [ ] Arrays and Strings
├── [ ] Searching
├── [ ] Sorting
├── [ ] Hashing
├── [ ] Two Pointers
├── [ ] Sliding Window
├── [ ] Stack and Queue
├── [ ] Recursion
├── [ ] Linked List
├── [ ] Trees
├── [ ] Heap / Priority Queue
├── [ ] Graphs
├── [ ] Greedy
├── [ ] Dynamic Programming
└── [ ] Advanced Graphs, Tries, Bit Manipulation, Math
```

## Arrays
```tree
Arrays
├── 1. [ ] Find Maximum Element
├── 2. [ ] Find Minimum Element
├── 3. [ ] Sum of Array
├── 4. [ ] Count Even and Odd Numbers
├── 5. [ ] Reverse an Array
├── 6. [ ] Check if Array is Sorted
├── 7. [ ] Search Target in Array
├── 8. [ ] Count Occurrences
├── 9. [ ] Remove Duplicates
├── 10. [ ] Move Zeroes
├── 11. [ ] Two Sum
├── 12. [ ] Maximum Sum Subarray
├── 13. [ ] Best Time to Buy and Sell Stock
├── 14. [ ] Rotate Array
└── 15. [ ] Product of Array Except Self
```

## Strings
```tree
Strings
├── 16. [ ] Reverse a String
├── 17. [ ] Check Palindrome
├── 18. [ ] Count Vowels and Consonants
├── 19. [ ] First Non-Repeating Character
├── 20. [ ] Check Anagram
├── 21. [ ] Remove Duplicate Characters
├── 22. [ ] Count Words
├── 23. [ ] Reverse Words
├── 24. [ ] Longest Common Prefix
├── 25. [ ] Valid Palindrome
├── 26. [ ] Longest Substring Without Repeating Characters
├── 27. [ ] Valid Parentheses
├── 28. [ ] String Compression
├── 29. [ ] Find All Anagrams
└── 30. [ ] Group Anagrams
```

## Algorithms
```tree
Algorithms
├── 1. Searching
│   ├── Linear Search
│   │   └── Example: Find 7 in [4, 2, 7, 9]
│   ├── Binary Search
│   │   └── Example: Find 23 in a sorted array
│   ├── Search on Answer
│   │   └── Example: Minimum capacity to ship packages in D days
│   ├── Graph Search
│   │   ├── BFS
│   │   │   └── Example: Shortest path in an unweighted grid
│   │   └── DFS
│   │       └── Example: Count islands in a grid
│   └── String Search
│       ├── Naive Search
│       │   └── Example: Find "abc" inside "zzabczz"
│       ├── KMP
│       │   └── Example: Efficient substring matching
│       └── Rabin-Karp
│           └── Example: Rolling-hash substring search
│
├── 2. Sorting
│   ├── Simple Sorting
│   │   ├── Bubble Sort
│   │   │   └── Example: Sort [5, 1, 4, 2]
│   │   ├── Selection Sort
│   │   │   └── Example: Repeatedly select the minimum element
│   │   └── Insertion Sort
│   │       └── Example: Sort cards in your hand
│   ├── Efficient Comparison Sorting
│   │   ├── Merge Sort
│   │   │   └── Example: Sort linked list / stable sorting
│   │   ├── Quick Sort
│   │   │   └── Example: In-place array sorting
│   │   └── Heap Sort
│   │       └── Example: Sort using a heap
│   └── Non-Comparison Sorting
│       ├── Counting Sort
│       │   └── Example: Sort scores from 0 to 100
│       ├── Radix Sort
│       │   └── Example: Sort integers digit by digit
│       └── Bucket Sort
│           └── Example: Sort floating-point numbers in [0, 1)
│
├── 3. Recursion and Backtracking
│   ├── Basic Recursion
│   │   └── Example: Factorial, Fibonacci
│   ├── Tree Recursion
│   │   └── Example: Generate all subsets
│   ├── Backtracking
│   │   ├── Permutations
│   │   │   └── Example: Generate all arrangements of [1, 2, 3]
│   │   ├── Combinations
│   │   │   └── Example: Choose k numbers from n numbers
│   │   ├── Constraint Search
│   │   │   └── Example: N-Queens, Sudoku solver
│   │   └── Path Exploration
│   │       └── Example: Word search in a grid
│
├── 4. Two Pointers
│   ├── Opposite Direction Pointers
│   │   └── Example: Two Sum in a sorted array
│   ├── Same Direction Pointers
│   │   └── Example: Remove duplicates from sorted array
│   └── Fast and Slow Pointers
│       └── Example: Detect cycle in a linked list
│
├── 5. Sliding Window
│   ├── Fixed-size Window
│   │   └── Example: Maximum sum of subarray of size k
│   ├── Variable-size Window
│   │   └── Example: Longest substring without repeating characters
│   └── Counting Window
│       └── Example: Find all anagrams of a string
│
├── 6. Hashing
│   ├── Hash Set
│   │   └── Example: Check if an array contains duplicates
│   ├── Hash Map / Dictionary
│   │   └── Example: Two Sum
│   ├── Frequency Counter
│   │   └── Example: Check if two strings are anagrams
│   └── Prefix Hashing
│       └── Example: Count subarrays with sum k
│
├── 7. Prefix / Suffix Techniques
│   ├── Prefix Sum
│   │   └── Example: Range sum query
│   ├── Prefix Product
│   │   └── Example: Product of array except self
│   ├── Suffix Sum
│   │   └── Example: Compare left and right sums
│   └── Difference Array
│       └── Example: Apply many range updates efficiently
│
├── 8. Stack
│   ├── Basic Stack
│   │   └── Example: Valid parentheses
│   ├── Monotonic Increasing Stack
│   │   └── Example: Next smaller element
│   ├── Monotonic Decreasing Stack
│   │   └── Example: Daily temperatures
│   └── Expression Stack
│       └── Example: Evaluate reverse Polish notation
│
├── 9. Queue and Deque
│   ├── Basic Queue
│   │   └── Example: BFS traversal
│   ├── Deque
│   │   └── Example: Sliding window maximum
│   └── Priority Queue / Heap
│       ├── Min Heap
│       │   └── Example: Kth largest element
│       └── Max Heap
│           └── Example: Find top k frequent elements
│
├── 10. Linked List Algorithms
│   ├── Traversal
│   │   └── Example: Print all nodes
│   ├── Reversal
│   │   └── Example: Reverse a linked list
│   ├── Fast and Slow Pointer
│   │   └── Example: Find middle node
│   ├── Merge
│   │   └── Example: Merge two sorted linked lists
│   └── Cycle Detection
│       └── Example: Detect loop in linked list
│
├── 11. Tree Algorithms
│   ├── DFS Traversals
│   │   ├── Preorder
│   │   │   └── Example: Serialize a tree
│   │   ├── Inorder
│   │   │   └── Example: Get sorted order from BST
│   │   └── Postorder
│   │       └── Example: Calculate subtree height
│   ├── BFS / Level Order
│   │   └── Example: Print tree level by level
│   ├── Binary Search Tree
│   │   └── Example: Search, insert, delete in BST
│   ├── Lowest Common Ancestor
│   │   └── Example: Find common ancestor of two nodes
│   └── Trie
│       └── Example: Autocomplete / prefix search
│
├── 12. Graph Algorithms
│   ├── Graph Traversal
│   │   ├── BFS
│   │   │   └── Example: Shortest path in unweighted graph
│   │   └── DFS
│   │       └── Example: Connected components
│   ├── Topological Sort
│   │   └── Example: Course schedule
│   ├── Shortest Path
│   │   ├── Dijkstra
│   │   │   └── Example: Shortest weighted path with non-negative edges
│   │   ├── Bellman-Ford
│   │   │   └── Example: Shortest path with negative edges
│   │   └── Floyd-Warshall
│   │       └── Example: All-pairs shortest paths
│   ├── Minimum Spanning Tree
│   │   ├── Kruskal
│   │   │   └── Example: Connect cities with minimum cost
│   │   └── Prim
│   │       └── Example: Build cheapest network
│   └── Union Find
│       └── Example: Detect cycle / number of connected components
│
├── 13. Greedy Algorithms
│   ├── Interval Greedy
│   │   └── Example: Meeting rooms / activity selection
│   ├── Sorting-based Greedy
│   │   └── Example: Assign cookies
│   ├── Heap-based Greedy
│   │   └── Example: Minimum cost to connect ropes
│   └── Local Optimal Choice
│       └── Example: Jump Game
│
├── 14. Dynamic Programming
│   ├── 1D DP
│   │   └── Example: Climbing stairs
│   ├── 2D DP
│   │   └── Example: Unique paths in a grid
│   ├── Knapsack DP
│   │   └── Example: 0/1 knapsack
│   ├── Subsequence DP
│   │   └── Example: Longest common subsequence
│   ├── Interval DP
│   │   └── Example: Matrix chain multiplication
│   ├── Tree DP
│   │   └── Example: House robber on a tree
│   └── State Machine DP
│       └── Example: Best time to buy and sell stock
│
├── 15. Divide and Conquer
│   ├── Split-and-Merge
│   │   └── Example: Merge sort
│   ├── Partition-based
│   │   └── Example: Quick sort / Quick select
│   └── Recursive Search
│       └── Example: Binary search
│
├── 16. Bit Manipulation
│   ├── Basic Bit Operations
│   │   └── Example: Check if number is odd/even
│   ├── XOR Tricks
│   │   └── Example: Find single number
│   ├── Bit Masking
│   │   └── Example: Generate subsets
│   └── Counting Bits
│       └── Example: Count number of 1s in binary
│
├── 17. Math Algorithms
│   ├── GCD / LCM
│   │   └── Example: Euclidean algorithm
│   ├── Prime Numbers
│   │   └── Example: Sieve of Eratosthenes
│   ├── Modular Arithmetic
│   │   └── Example: Fast exponentiation
│   ├── Combinatorics
│   │   └── Example: Count ways to choose k items
│   └── Geometry
│       └── Example: Distance between two points
│
└── 18. String Algorithms
    ├── Basic String Processing
    │   └── Example: Reverse words in a sentence
    ├── Palindrome Techniques
    │   └── Example: Longest palindromic substring
    ├── Pattern Matching
    │   └── Example: KMP substring search
    ├── Trie-based String Search
    │   └── Example: Word dictionary
    └── Rolling Hash
        └── Example: Detect repeated substring
```

## Good start
```tree
Start Here
├── [ ] Linear Search
├── [ ] Binary Search
├── [ ] Bubble Sort
├── [ ] Selection Sort
├── [ ] Insertion Sort
├── [ ] Merge Sort
├── [ ] Quick Sort
├── [ ] Two Sum using Hash Map
├── [ ] Valid Parentheses using Stack
├── [ ] Reverse Linked List
├── [ ] Tree DFS
├── [ ] Tree BFS
├── [ ] Graph BFS
├── [ ] Graph DFS
├── [ ] Basic Recursion
└── [ ] Climbing Stairs DP
```