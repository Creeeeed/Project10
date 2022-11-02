package csc251.amazing;
import java.util.*;

public class MazeWander {
    private static String filePath = "scr\\csc251.amazing";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        String filename = scan.nextLine();

        Maze labyrinth = new Maze(filePath + filename);

        System.out.println(labyrinth);

        MazeSolver solver = new MazeSolver(labyrinth);

        if(solver.traverse(0,0))
            System.out.println("Maze was successfully transversed");
        else
            System.out.println("There's no possible path");

        System.out.println(labyrinth);
        scan.close();

    }
}
