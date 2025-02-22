package com.example;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IterativeTest {

    public IterativeTest() {
    }

    @Test
    public void testHanoiWithThreeDisks() {
        TowersOfHanoiIterative solver = new TowersOfHanoiIterative();
        List<String> actualMoves = solver.solve(3, 'A', 'B', 'C');
        List<String> expectedMoves = List.of(
                "1. Move disk 1 from A → C",
                "2. Move disk 2 from A → B",
                "3. Move disk 1 from C → B",
                "4. Move disk 3 from A → C",
                "5. Move disk 1 from B → A",
                "6. Move disk 2 from B → C",
                "7. Move disk 1 from A → C"
        );
        Assertions.assertEquals(expectedMoves, actualMoves);
    }

    @Test
    public void testHanoiWithOneDisk() {
        TowersOfHanoiIterative solver = new TowersOfHanoiIterative();
        List<String> actualMoves = solver.solve(1, 'A', 'B', 'C');
        List<String> expectedMoves = List.of("1. Move disk 1 from A → C");
        Assertions.assertEquals(expectedMoves, actualMoves);
    }

    @Test
    public void testHanoiWithTwoDisks() {
        TowersOfHanoiIterative solver = new TowersOfHanoiIterative();
        List<String> actualMoves = solver.solve(2, 'A', 'B', 'C');
        List<String> expectedMoves = List.of(
                "1. Move disk 1 from A → B",
                "2. Move disk 2 from A → C",
                "3. Move disk 1 from B → C"
        );
        Assertions.assertEquals(expectedMoves, actualMoves);
    }
}
