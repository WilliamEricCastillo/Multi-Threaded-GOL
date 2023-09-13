import java.util.ArrayList;

public class Board
{
    private static int COLUMNS;
    private static int ROWS;
    private static String[][] SMATRIX;
    private CellState[][] CMATRIX;

    public Board(int rows, int columns)
    {
        ROWS = rows;
        COLUMNS = columns;
    }

    public String[][] createBoard()
    {
        SMATRIX = new String[ROWS][COLUMNS];
        CMATRIX = new CellState[ROWS][COLUMNS];

        for(int i = 0; i < SMATRIX.length; i++)
        {
            for(int j = 0; j < SMATRIX[0].length; j++)
            {
                CMATRIX[i][j] = new CellState();
            }
        }
        return SMATRIX;
    }

    private void printBoard()
    {

        for (int r = 0; r < SMATRIX.length; ++r)
        {
            for (int j = 0; j < SMATRIX[0].length; ++j)
            {
                System.out.print(SMATRIX[r][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void finalPrintGrid(int generations)
    {
        for (int i = 0; i < SMATRIX.length; ++i)
        {
            for (int j = 0; j < SMATRIX[0].length; ++j)
            {
                System.out.print(SMATRIX[i][j] + "  ");
            }

            System.out.println();
        }
        System.out.println("Generation  #" + generations);
    }

    private void threadGenerations(int generations) throws InterruptedException
    {
        for (int i = 0; i < generations; i++)
        {
            ArrayList<ComputeCell> threadPath = new ArrayList<>();
            int THREADCOUNT = 0;

            for (int j = 1; j < SMATRIX.length - 1; j++)
            {
                for (int k = 1; k < SMATRIX[0].length - 1; k++)
                {
                    threadPath.add(new ComputeCell(SMATRIX, CMATRIX[j][k], j, k));
                    threadPath.get(THREADCOUNT).start();
                    THREADCOUNT++;
                }
            }

            THREADCOUNT = 0;

            for (int j = 1; j < SMATRIX.length - 1; j++)
            {
                for (int k = 1; k < SMATRIX[0].length - 1; k++)
                {
                    threadPath.get(THREADCOUNT).t.join();
                    THREADCOUNT++;
                }
            }

            for (int n = 0; n < SMATRIX.length; n++)
            {
                for (int m = 0; m < SMATRIX[0].length; m++)
                {
                    if (CMATRIX[n][m].getStatus())
                    {
                        SMATRIX[n][m] = "X";
                    }
                    else
                    {
                        SMATRIX[n][m] = ".";
                    }
                }
            }
        }
    }

    public void simulate(int generations) throws InterruptedException
    {
        printBoard();
        threadGenerations(generations);
        finalPrintGrid(generations);
    }
}