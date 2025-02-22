package com.example;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class IterativeEdgeCasesTest {

    private final TowersOfHanoiSolver iterativeSolver = new TowersOfHanoiIterative();

    @Test
    public void testIterativeHanoiWith0Disks() {
        Assert.assertThrows(IllegalArgumentException.class,
                () -> iterativeSolver.solve(0, 'A', 'B', 'C'));
    }

    @Test
    public void testIterativeHanoiWithNegativeDisks() {
        Assert.assertThrows(IllegalArgumentException.class,
                () -> iterativeSolver.solve(-1, 'A', 'B', 'C'));
    }

    @Test
    public void testIterativeHanoiWithLargeNumberOfDisks() {
        List<String> moves = iterativeSolver.solve(10, 'A', 'B', 'C');
        Assert.assertEquals(1023, moves.size());
    }

    @Test
    public void testIterativeHanoiWithLargeNumberOfDisksAgain() {
        List<String> moves = iterativeSolver.solve(10, 'A', 'B', 'C');
        Assert.assertEquals(1023, moves.size());
    }
}
