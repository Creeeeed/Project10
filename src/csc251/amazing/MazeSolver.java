package csc251.amazing;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MazeSolver {
    public static final int OPEN = 1;
    public static final int TRIED = 2;
    public static final int PATH = 3;

    private int numberRows, numberColumns;
    private int endRow, endColumns;
    private int [][] grid;


    public Maze(String filename) throws FileNotFoundException{
        Scanner scan = new Scanner(new File(filename));
        numberRows = scan.nextInt();
        numberColumns = scan.nextInt();

        grid = new int[numberRows][numberColumns];
        for (int i = 0; i < numberRows; i++)
            for(int j = 0; j < numberColumns; j++)
                grid[i][j] = scan.nextInt();
        scan.close();

        endRow = getRows()-1;
        endColumns = getColumns()-1;

    }

    public void tryPosition(int row, int col)
    {
        grid[row][col] = TRIED;
    }

    public boolean solved(int row, int col)
    {
        return (row == endRow && col == endColumn);

    }
    public int getColumns()
    {
        return grid[0].length;
    }

    public void markPath(int row, int col)
    {
        grid[row][col] = PATH;
    }


}
