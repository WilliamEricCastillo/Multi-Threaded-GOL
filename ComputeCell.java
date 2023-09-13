import java.util.Objects;

public class ComputeCell implements Runnable {

    private int ROWS;
    private int COLUMNS;
    private String[][] matrix;
    private CellState cell;
    private int alive = 0;
    public Thread t;

    public ComputeCell(String[][] fileMatrix, CellState cState, int row, int col )
    {
        matrix = fileMatrix;
        cell = cState;
        ROWS = row;
        COLUMNS = col;
    }

    public void start()
    {
        t = new Thread(this);
        t.start();
    }

    public void run()
    {
        int alive = 0;

        if (Objects.equals(matrix[ROWS][COLUMNS - 1], "X")) alive++;
        if (Objects.equals(matrix[ROWS][COLUMNS + 1], "X")) alive++;
        if (Objects.equals(matrix[ROWS + 1][COLUMNS], "X")) alive++;
        if (Objects.equals(matrix[ROWS - 1][COLUMNS], "X")) alive++;
        if (Objects.equals((matrix[ROWS - 1][COLUMNS - 1]), "X")) alive++;
        if (Objects.equals(matrix[ROWS - 1][COLUMNS + 1], "X")) alive++;
        if (Objects.equals(matrix[ROWS + 1][COLUMNS - 1], "X")) alive++;
        if (Objects.equals(matrix[ROWS + 1][COLUMNS + 1], "X")) alive++;


        if (Objects.equals(matrix[ROWS][COLUMNS], "X"))
        {
            if (alive < 2)
            {
                cell.setStatus(false);
            }
            else if ((alive == 2) || (alive == 3))
            {
                cell.setStatus(true);
            }
            else cell.setStatus(false);
        }
        else
        {
            if (alive != 3)
            {
                cell.setStatus(false);
            }
            else
            {
                cell.setStatus(true);
            }
        }
        alive = 0;
    }
}
