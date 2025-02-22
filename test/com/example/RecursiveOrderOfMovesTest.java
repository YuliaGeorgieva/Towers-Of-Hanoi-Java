package com.example;

import java.util.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveOrderOfMovesTest {
    private final TowersOfHanoiSolver recursiveSolver = new TowersOfHanoiRecursive();

    private void validateMoves(List<String> moves) {
        Map<Character, Stack<Integer>> rods = new HashMap<>();
        rods.put('A', new Stack<>());
        rods.put('B', new Stack<>());
        rods.put('C', new Stack<>());

        for (int i = 3; i > 0; i--) {
            rods.get('A').push(i);
        }

        for (String move : moves) {
            String[] parts = move.split(" ");
            int diskNumber = Integer.parseInt(parts[3]);
            char fromRod = parts[5].charAt(0);
            char toRod = parts[7].charAt(0);

            if (!rods.get(fromRod).isEmpty() && !rods.get(toRod).isEmpty()) {
                int topDiskOnToRod = rods.get(toRod).peek();
                if (topDiskOnToRod < diskNumber) {
                    throw new IllegalArgumentException("Invalid move: Cannot place disk " + diskNumber + " on top of a smaller disk on rod " + toRod);
                }
            }

            if (rods.get(fromRod).isEmpty() || !rods.get(fromRod).contains(diskNumber)) {
                throw new IllegalArgumentException("Invalid move: No disk " + diskNumber + " on rod " + fromRod);
            }

            rods.get(fromRod).remove((Integer) diskNumber);
            rods.get(toRod).push(diskNumber);
        }
    }

    @Test
    public void testRecursiveSolutionGeneratesValidMovesFor3Disks() {
        List<String> moves = recursiveSolver.solve(3, 'A', 'B', 'C');
        Assertions.assertDoesNotThrow(() -> validateMoves(moves));
    }

    @Test
    public void testRecursiveSolutionGeneratesValidMovesFor2Disks() {
        List<String> moves = recursiveSolver.solve(2, 'A', 'B', 'C');
        Assertions.assertDoesNotThrow(() -> validateMoves(moves));
    }
}
