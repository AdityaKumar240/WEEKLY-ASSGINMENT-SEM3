# Week 10 – Complexity Analysis

| Assignment | Time Complexity | Auxiliary Space |
|---|---:|---:|
| Busiest Bus Row | O(r × c) | O(1) |
| Class Attendance Tracker | O(n) | O(1) |
| Duty Roster Rotation | O(n) | O(n) for the returned roster |
| Exam Score Band Counter | O(log n) | O(1) |
| Second-Best Score | O(n) | O(1) |

## Notes
- Busiest Bus Row checks every seat and updates the best row only when a strictly larger total is found, so ties keep the smaller row index.
- Class Attendance Tracker counts present days and tracks the longest streak in one pass.
- Duty Roster Rotation reduces large rotations with k % n and places each name directly at its rotated index.
- Exam Score Band Counter uses two binary searches: the first score greater than or equal to low, and the first score greater than high. Their index difference includes duplicates at both boundaries.
- Second-Best Score tracks the two largest distinct values in one pass and does not sort the input.

## Input Order
- Busiest Bus Row: rows, columns, then the grid values row by row.
- Class Attendance Tracker: number of days, then the 0/1 attendance values.
- Duty Roster Rotation: number of names, the names, then k.
- Exam Score Band Counter: number of scores, the sorted scores, then low and high.
- Second-Best Score: number of scores, then the scores.
