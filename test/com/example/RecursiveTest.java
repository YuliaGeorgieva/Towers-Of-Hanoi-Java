package com.example;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveTest {
    private final TowersOfHanoiSolver recursiveSolver = new TowersOfHanoiRecursive();

    public RecursiveTest() {
    }

    @Test
    public void testRecursiveHanoiWith3Disks() {
        List<String> expectedMoves = List.of(
                "1. Move disk 1 from A → C",
                "2. Move disk 2 from A → B",
                "3. Move disk 1 from C → B",
                "4. Move disk 3 from A → C",
                "5. Move disk 1 from B → A",
                "6. Move disk 2 from B → C",
                "7. Move disk 1 from A → C"
        );
        List<String> actualMoves = this.recursiveSolver.solve(3, 'A', 'B', 'C');
        Assertions.assertEquals(expectedMoves, actualMoves);
    }

    @Test
    public void testRecursiveHanoiWith1Disk() {
        List<String> expectedMoves = List.of("1. Move disk 1 from A → C");
        List<String> actualMoves = this.recursiveSolver.solve(1, 'A', 'B', 'C');
        Assertions.assertEquals(expectedMoves, actualMoves);
    }

    @Test
    public void testRecursiveHanoiWith2Disks() {
        List<String> expectedMoves = List.of(
                "1. Move disk 1 from A → B",
                "2. Move disk 2 from A → C",
                "3. Move disk 1 from B → C"
        );
        List<String> actualMoves = this.recursiveSolver.solve(2, 'A', 'B', 'C');
        Assertions.assertEquals(expectedMoves, actualMoves);
    }
}
