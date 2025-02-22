package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 //Iterative solution for the Towers of Hanoi
 */


public class TowersOfHanoiIterative implements TowersOfHanoiSolver {

    public TowersOfHanoiIterative() {
    }

    @Override
    public List<String> solve(int n, char startRod, char middleRod, char endRod) {
        List<String> moves = new ArrayList<>();

        if (n <= 0) {
            throw new IllegalArgumentException("Number of disks must be greater than 0.");
        }

        Stack<Integer> startRodStack = new Stack<>();
        Stack<Integer> middleRodStack = new Stack<>();
        Stack<Integer> endRodStack = new Stack<>();

        for (int i = n; i >= 1; --i) {
            startRodStack.push(i);
        }

        int totalMoves = (1 << n) - 1;
        if (n % 2 == 0) {

            char temp = middleRod;
            middleRod = endRod;
            endRod = temp;
        }

        int moveCount = 1;

        for (int move = 1; move <= totalMoves; ++move) {
            Stack<Integer> fromRod;
            Stack<Integer> toRod;
            char fromRodName;
            char toRodName;

            if (move % 3 == 1) {
                fromRod = startRodStack;
                toRod = endRodStack;
                fromRodName = startRod;
                toRodName = endRod;
            } else if (move % 3 == 2) {
                fromRod = startRodStack;
                toRod = middleRodStack;
                fromRodName = startRod;
                toRodName = middleRod;
            } else {
                fromRod = middleRodStack;
                toRod = endRodStack;
                fromRodName = middleRod;
                toRodName = endRod;
            }


            if (fromRod.isEmpty()) {
                fromRod.push(toRod.pop());
                moves.add(moveCount + ". Move disk " + fromRod.peek() + " from " + toRodName + " → " + fromRodName);

            } else if (toRod.isEmpty()) {
                toRod.push(fromRod.pop());
                moves.add(moveCount + ". Move disk " + toRod.peek() + " from " + fromRodName + " → " + toRodName);

            } else if (fromRod.peek() < toRod.peek()) {
                toRod.push(fromRod.pop());
                moves.add(moveCount + ". Move disk " + toRod.peek() + " from " + fromRodName + " → " + toRodName);

            } else {
                fromRod.push(toRod.pop());
                moves.add(moveCount + ". Move disk " + fromRod.peek() + " from " + toRodName + " → " + fromRodName);

            }

            moveCount++;
        }

        return moves;
    }
}
