# Week 11 – Sorting Algorithms

| Assignment | Algorithm | Time Complexity | Auxiliary Space |
|---|---|---:|---:|
| Height Line-Up | Bubble sort | O(n²) worst case | O(1) |
| Prize Table | Selection sort (descending) | O(n²) | O(1) |
| Library Book Shelf | Insertion sort | O(n²) worst case; O(n) best case | O(1) |
| Is the Queue in Order? | Single-pass order check | O(n) | O(1) |
| Dice Throw Tally | Counting sort | O(n + 6), i.e. O(n) | O(1) extra for fixed counts; O(n) result |

## Input Order
- Height Line-Up: number of students, then heights.
- Prize Table: number of marks, then marks.
- Library Book Shelf: number of books, then book numbers.
- Is the Queue in Order?: number of students, then token numbers. The program prints the 1-based position of the first token that breaks the order, or -1.
- Dice Throw Tally: number of throws, then values from 1 to 6.

All sorting is implemented manually; none of the programs call Arrays.sort.
