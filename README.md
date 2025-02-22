# Solution for Towers of Hanoi using Java


After cloning this repository run:

#### java com.example.Main

There are several tests for performance, for edge cases and order of moves as well as the implementation of the recursive and iterative solutions


## TOWERS OF HANOI

The Towers of Hanoi is a classic mathematical puzzle involving three rods(A ,B, C) and N 
disks of different sizes. The puzzle starts with all the disks stacked in decreasing size on one 
rod, and the objective is to move all the disks to another rod following these rules: 
1. Only one disk can be moved at a time. 
2. A larger disk cannot be placed on top of a smaller disk. 
3. A disk can only be moved from the top of one rod to another rod.

Requirements

● Implement the Towers of Hanoi algorithm using recursion.
● Implement the same algorithm without recursion
● Document the solutions with clear explanations.
● Write test cases to validate correctness.

Example 
For N = 3 disks, the solution involves the following moves: 
1. Move disk 1 from A → C 
2. Move disk 2 from A → B 
3. Move disk 1 from C → B 
4. Move disk 3 from A → C 
5. Move disk 1 from B → A 
6. Move disk 2 from B → C 
7. Move disk 1 from A → C


![HanoiTowers1](https://github.com/user-attachments/assets/33e5f4f1-aa5a-4404-a485-733586b38b46)
![HanoiTowers2](https://github.com/user-attachments/assets/9ba48a0b-07ce-44a5-a801-7e27e6e99aa3)
![HanoiTowers3](https://github.com/user-attachments/assets/98154467-e7fb-4e6d-a0aa-08295aa60a93)


Recursive solution: 

The TowersOfHanoiRecursive class implements the TowersOfHanoiSolver interface.
The solve method initializes the process and solveHanoi is the recursive method that handles the moves
The moves are stored in a list, which is  then returned to the main class to display.


![Diagram](https://github.com/user-attachments/assets/58581a9f-a6fd-458f-b99f-242dcd47a920)



Iterative solution: 

Uses a stack-based approach to simulate the movements of disks. The algorithm calculates the total number of moves required (2^n-1) and then  decides which disks to move.
The TowersOfHanoiIterative class also implements the TowersOfHanoiSolver interface. It initializes stacks for each rod and fills the starting rod with disks.
If the number of disks is even or odd, the algorithm alters the movement sequence.


![Logic](https://github.com/user-attachments/assets/87d87509-4b4c-45fb-b98e-314f99059241)


The time complexity for both is O(2^n)


