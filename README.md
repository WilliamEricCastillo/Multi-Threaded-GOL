# Multi-Threaded-GOL
This is a Java program that simulates Conway's Game of Life using multi-threading.

## Overview
Conway's Game of Life is a cellular automaton simulation that models the evolution of cells on a grid. In this program, we provide a multi-threaded implementation to efficiently compute generations of the game.

## How to Run

1. Clone the repository to your local machine.
2. Compile and run the program using your preferred Java development environment or command-line tools.
3. Provide the input configuration in a text file (e.g., `GameofLifeTestFile.txt`) with the initial state of the grid.
4. Modify the `ROWS` and `COLUMNS` constants in the `Main` class to match your grid size.
5. Run the program to simulate the game for a specified number of generations.
6. View the final state of the grid in the console output.

## Example Input File

The input file should contain the initial state of the grid, where 'X' represents live cells and '.' represents dead cells. For example:

```
X X . . . . . . . .
. . X . . . . . . .
. X X . . . . . . .
. . . . . . . . . .
. . . . X . . . . .
. . . X X . . . . .
. . . . . . . . . .
. . . . . . . . . .
. . . . . . . . . .
```

## Dependencies

- Java (JDK 8 or later)

## Contributor
* William Castillo