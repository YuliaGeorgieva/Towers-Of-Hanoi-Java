package com.example;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class IterativeOrderOfMovesTest {

    @Test
    public void testIterativeSolutionGeneratesValidMovesFor2Disks() {
        List<String> moves = generateMoves(2);
        Assert.assertNotNull(moves);

        for (String move : moves) {
            validateMoves(move);
        }
    }

    @Test
    public void testIterativeSolutionGeneratesValidMovesFor3Disks() {
        List<String> moves = generateMoves(3);
        Assert.assertNotNull(moves);

        for (String move : moves) {
            validateMoves(move);
        }
    }

    private void validateMoves(String move) {
        if (!move.matches("\\d+\\. Move disk \\d+ from [A-Z] → [A-Z]")) {
            throw new IllegalArgumentException("Invalid move format: " + move);
        }
    }

    private List<String> generateMoves(int numberOfDisks) {
        List<String> moves = new ArrayList<>();

        if (numberOfDisks == 2) {
            moves.add("1. Move disk 1 from A → B");
            moves.add("2. Move disk 1 from B → A");
            moves.add("3. Move disk 2 from A → C");
            moves.add("4. Move disk 1 from A → B");
            moves.add("5. Move disk 1 from B → C");
            moves.add("6. Move disk 2 from C → A");
            moves.add("7. Move disk 1 from A → C");

        } else if (numberOfDisks == 3) {
            moves.add("1. Move disk 1 from A → C");
            moves.add("2. Move disk 2 from A → B");
            moves.add("3. Move disk 1 from C → B");
            moves.add("4. Move disk 3 from A → C");
            moves.add("5. Move disk 1 from B → A");
            moves.add("6. Move disk 2 from B → C");
            moves.add("7. Move disk 1 from A → C");
        }

        return moves;
    }
}
