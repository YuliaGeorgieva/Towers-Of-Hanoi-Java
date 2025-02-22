package com.example;

import java.util.List;

//Interface for towers of hanoi solver
public interface TowersOfHanoiSolver {
    List<String> solve(int numberOfDisks, char startRod, char middleRod, char endRod);
}
