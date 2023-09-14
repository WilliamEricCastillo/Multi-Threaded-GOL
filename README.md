# Multi-Threaded Game of Life
This Java program simulates Conway's Game of Life using multi-threading.

## Techniques Used

- **Multi-Threading**: The program leverages multi-threading for concurrent cell state computation, enhancing performance.
- **Object-Oriented Design**: An object-oriented approach was utilized with classes such as `Board`, `ComputeCell`, and `CellState` for modularity and structure.
- **File Input**: Initial configurations are read from a text file to set up the grid.
- **Efficient Grid Management**: The program efficiently manages the grid using loops and 2D arrays for state updates and board display.
  
## Rules of the Game

1. **Cell States**: The game is played on a grid of cells and each cell can be in one of two states:<br> 'alive' ( represented by 'X') or "dead" ( represented by '.').
2. **Neighborhood**: Each cell has eight neighbors, which are the cells horizontally, vertically, and diagonally adjacent to it.
3. **Birth**: A dead cell becomes alive in the next generation if it has exactly three live neighbors.
4. **Survival**: A live cell continues to live in the next generation if it has either two or three live neighbors.
5. **Death**: In all other cases, a cell dies or remains dead in the next generation.
6. **Time Advancement**: The game evolves one generation at a time. All cells are updated simultaneously based on the rules.
   
These rules lead to complex patterns and behaviors, and the Game of Life is known for its ability to produce interesting and sometimes unpredictable patterns.

## Example Input Txt File

The input file should contain the initial state of the grid, where 'X' represents live cells and  '.' represents dead cells. <br> The number '15' at the bottom of the grid, represents the number of generations that will be executed. <br> 
<br> For example:

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

## How to Run

1. Clone the repository to your local machine.
   ```bash
   https://github.com/WilliamEricCastillo/Multi-Threaded-GOL.git
3. Compile and run the program using your preferred Java development environment or command-line tools.
4. Provide the input configuration in a text file (e.g., `GameofLifeTestFile.txt`) with the initial state of the grid.
5. Modify the `ROWS` and `COLUMNS` constants in the `Main` class to match your grid size. <br> By default, `ROWS` and `COLUMNS` are set to 20 x 20.
6. Run the program to simulate the game for a specified number of generations.
7. View the final state of the grid in the console output.


## Dependencies

- Java (JDK 8 or later)

## Contributor
* William Castillo
