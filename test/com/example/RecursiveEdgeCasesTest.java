package com.example;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecursiveEdgeCasesTest {
    private final TowersOfHanoiSolver recursiveSolver = new TowersOfHanoiRecursive();

    public RecursiveEdgeCasesTest() {
    }

    @Test
    public void testRecursiveHanoiWith0Disks() {
        List<String> moves = this.recursiveSolver.solve(0, 'A', 'B', 'C');
        Assertions.assertEquals(List.of(), moves);
    }

    @Test
    public void testRecursiveHanoiWithNegativeDisks() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            this.recursiveSolver.solve(-1, 'A', 'B', 'C');
        });
    }

    @Test
    public void testRecursiveHanoiWithNonIntegerInput() {

    }

    @Test
    public void testRecursiveHanoiWithLargeNumberOfDisks() {
        List<String> moves = this.recursiveSolver.solve(10, 'A', 'B', 'C');
        Assertions.assertEquals(1023, moves.size());
    }
}
