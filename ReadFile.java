import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile
{
    private BufferedReader buffReader;
    private  String filePath = "" ;
    private String[][] arrayFromFile;

    ReadFile(String path)
    {
        filePath += path;
    }

    public String[][] readFile(String[][] arr) throws IOException
    {
        createBuffer();
        arrayFromFile = arr;

        for (int i = 0; i < 20; i++)
        {
            String readingLine = buffReader.readLine();

            for (int j = 0; j < 20; j++)
            {
                arrayFromFile[i][j] = String.valueOf(readingLine.charAt(j));
            }
        }
        closeBuffer();
        return arrayFromFile;
    }

    private void createBuffer() throws FileNotFoundException
    {
        buffReader = new BufferedReader(new FileReader(filePath));
    }

    private void closeBuffer() throws IOException
    {
        buffReader.close();
    }

    public int FileLastLinetoInt() throws IOException
    {
        createBuffer();
        String s = null;
        String j = "null";

        while ((s=buffReader.readLine())!=null)
        {
            j = s;
        }
        closeBuffer();
        return Integer.parseInt(j);
    }
}