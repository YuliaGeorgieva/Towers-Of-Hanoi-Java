package com.example;

import java.io.PrintStream;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


/**
 * The Main class allows the user to choose the number of disks and solves the Towers of Hanoi
 * It displays both the recursive and iterative solution
 */


public class Main {

    public Main() {
    }

    public static void main(String[] args) {

        TowersOfHanoiSolver iterativeSolver = new TowersOfHanoiIterative();
        TowersOfHanoiSolver recursiveSolver = new TowersOfHanoiRecursive();

        Scanner scanner = new Scanner(System.in);

        int numDisks = 0;

        while (numDisks <= 0) {
            System.out.print("Enter the number of disks: ");
            if (scanner.hasNextInt()) {
                numDisks = scanner.nextInt();
                if (numDisks <= 0) {
                    System.out.println("Please enter a number bigger than 0.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        System.out.println("\nRecursive solution for Towers of Hanoi:");

        List<String> recursiveMoves = recursiveSolver.solve(numDisks, 'A', 'B', 'C');
        PrintStream printStream = System.out;

        Objects.requireNonNull(printStream);
        recursiveMoves.forEach(printStream::println);

        System.out.println("\n--------------------------------\n");

        System.out.println("Iterative solution for Towers of Hanoi:");
        List<String> iterativeMoves = iterativeSolver.solve(numDisks, 'A', 'B', 'C');

        printStream = System.out;

        Objects.requireNonNull(printStream);
        iterativeMoves.forEach(printStream::println);

        scanner.close();
    }
}
