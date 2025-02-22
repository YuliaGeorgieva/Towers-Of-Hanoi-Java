package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursivePerformanceTest {
    private final TowersOfHanoiSolver recursiveSolver = new TowersOfHanoiRecursive();

    public RecursivePerformanceTest() {
    }

    @Test
    public void testRecursivePerformanceWith20Disks() {
        Assertions.assertDoesNotThrow(() -> {
            return this.recursiveSolver.solve(20, 'A', 'C', 'B');
        });
    }
}
