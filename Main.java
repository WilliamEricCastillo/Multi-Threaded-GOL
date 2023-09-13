import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException, InterruptedException {

        String gameFilePath = "/Users/willcastle/Documents/Canvas Submissions/Submissions/OOP/GameofLifeTestFile.txt";
        new GameOfLifeThreads(gameFilePath);
    }
}
