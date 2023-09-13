# Multi-Threaded Game of Life
This is a Java program that simulates Conway's Game of Life using multi-threading.

## Overview
Conway's Game of Life is a cellular automaton simulation that models the evolution of cells on a grid. In this program, we provide a multi-threaded implementation to efficiently compute generations of the game.

## How to Run

1. Clone the repository to your local machine.
   ```bash
   https://github.com/WilliamEricCastillo/Multi-Threaded-GOL.git
3. Compile and run the program using your preferred Java development environment or command-line tools.
4. Provide the input configuration in a text file (e.g., `GameofLifeTestFile.txt`) with the initial state of the grid.
5. Modify the `ROWS` and `COLUMNS` constants in the `Main` class to match your grid size. <br> By default, `ROWS` and `COLUMNS` are set to 20 x 20.
6. Run the program to simulate the game for a specified number of generations.
7. View the final state of the grid in the console output.

## Example Input File

The input file should contain the initial state of the grid, where 'X' represents live cells, '.' represents dead cells, and '15' represents the number of generations. For example:

```
....................
....................
....................
....................
....................
....................
........XXXX........
........XXXX........
........XXXX........
........XXXX........
........XXXX........
....................
....................
....................
....................
....................
....................
....................
....................
....................
15
```

## Dependencies

- Java (JDK 8 or later)

## Contributor
* William Castillo
