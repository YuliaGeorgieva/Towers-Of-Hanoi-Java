package com.example;

import java.util.ArrayList;
import java.util.List;


/**
 //Recursive solution for the Towers of Hanoi
 */

public class TowersOfHanoiRecursive implements TowersOfHanoiSolver {

    private List<String> moves = new ArrayList<>();

    public TowersOfHanoiRecursive() {
    }

    @Override
    public List<String> solve(int n, char startRod, char middleRod, char endRod) {

        if (n < 0) {
            throw new IllegalArgumentException("Number of disks must be 0 or more.");
        }

        this.moves.clear();


        if (n == 0) {
            return this.moves;
        }

        int[] moveNumber = {1};
        this.solveHanoi(n, startRod, middleRod, endRod, moveNumber);
        return this.moves;
    }

    private void solveHanoi(int n, char startRod, char middleRod, char endRod, int[] moveNumber) {
        if (n == 1) {

            this.moves.add(moveNumber[0] + ". Move disk 1 from " + startRod + " → " + endRod);
            moveNumber[0]++;

        } else {

            this.solveHanoi(n - 1, startRod, endRod, middleRod, moveNumber);
            this.moves.add(moveNumber[0] + ". Move disk " + n + " from " + startRod + " → " + endRod);
            moveNumber[0]++;
            this.solveHanoi(n - 1, middleRod, startRod, endRod, moveNumber);
        }
    }
}
