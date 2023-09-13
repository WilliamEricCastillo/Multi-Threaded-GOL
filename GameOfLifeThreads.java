import java.io.IOException;

public class GameOfLifeThreads {

    GameOfLifeThreads(String gameFilePath) throws IOException, InterruptedException
    {
        int ROWS = 20;
        int COLUMNS = 20;
        int genCount;

        ReadFile read = new ReadFile(gameFilePath);
        Board board = new Board(ROWS,COLUMNS);
        read.readFile(board.createBoard());

        //generation count
        genCount = read.FileLastLinetoInt();
        board.simulate(genCount);
    }
}
