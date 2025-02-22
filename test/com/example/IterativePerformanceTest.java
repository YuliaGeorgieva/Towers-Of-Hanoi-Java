package com.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class IterativePerformanceTest {
    private final TowersOfHanoiSolver iterativeSolver = new TowersOfHanoiIterative();

    public IterativePerformanceTest() {
    }

    @Test
    public void testIterativePerformanceWith20Disks() {
        Assertions.assertDoesNotThrow(() -> {
            List<String> moves = this.iterativeSolver.solve(20, 'A', 'B', 'C');

            Assertions.assertFalse(moves.isEmpty(), "The moves list should not be empty.");
            return null;
        });
    }
}
