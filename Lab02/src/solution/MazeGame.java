package solution;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

/**
 * A maze game.
 * 
 * @author Connor Lawson
 * @version 1.3030225300
 *
 */
public class MazeGame
{
    /**
     * The size of each side of the game map.
     */
    private final static int HEIGHT = 19;
    private final static int WIDTH = 39;

    /**
     * The game map, as a 2D array of ints.
     */
    private boolean[][] blocked;
    
    /**
     * Keeps track of where user has been in the maze.
     */
    private boolean[][] breadCrumbs;
    
    /**
     * The current location of the player vertically.
     */
   
    private int userRow;
    /**
     * The current location of the player horizontally.
     */
    
    private int userCol;
    /**
     * The scanner from which each move is read.
     */
    
    private Scanner moveScanner;
    /**
     * The row and column of the goal.
     */
    
    private int goalCol;
    private int goalRow;
    
    /**
     * The row and column of the start.
     */
    
    private int startCol;
    private int startRow;
    
    /**
     * Constructor initializes the maze with the data in 'mazeFile'.
     * @param mazeFile the input file for the maze
     */
    public MazeGame(String mazeFile)
    {
        loadMaze(mazeFile);
        setMoveScanner(new Scanner(System.in));
    }

    /**
     * Constructor initializes the maze with the 'mazeFile' and the move 
     * scanner with 'moveScanner'.
     * @param mazeFile the input file for the maze
     * @param moveScanner the scanner object from which to read user moves
     */
    public MazeGame(String mazeFile, Scanner moveScanner)
    {
        loadMaze(mazeFile);
        this.moveScanner = moveScanner;
    }

    /**
     * getMaze returns a copy of the current maze for testing purposes.
     * 
     * @return the grid
     */
    public boolean[][] getMaze()
    {
        if (blocked == null)
        {
            return null;
        }
        boolean[][] copy = new boolean[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++)
        {
            for (int j = 0; j < WIDTH; j++)
            {
                copy[i][j] = blocked[i][j];
            }
        }
        return copy;
    }

    /**
     * setMaze sets the current maze for testing purposes.
     * 
     * @param maze
     *            
     */
    public void setMaze(boolean[][] maze)
    {
        this.blocked = maze;
    }
    
    /**
    * getBlocked return blocked.
    * 
    * @return copy.
    */
    public boolean[][] getBlocked()
    {
        if (blocked == null)
        {
            return null;
        }
        boolean[][] copy = new boolean[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++)
        {
            for (int j = 0; j < WIDTH; j++)
            {
                copy[i][j] = !blocked[i][j];
            }
        }
        return copy;
    }
   /**
    * setBlocked sets blocked
    * 
    * @param blocked 
    */
    public void setBlocked(boolean[][] blocked)
    {
        this.blocked = blocked;
    }
    /**
     * getUserRow returns the vertical location of the user.
     * 
     * @return vertical location.
     */
    public int getUserRow()
    {
        return userRow;
    }
    
    /**
     * setUserRow sets the vertical location of the user.
     * 
     * @param uRow is the user row.
     */
    public void setUserRow(int uRow)
    {
        userRow = uRow;
    }
    
    /**
     * getUserCol returns the horizontal location of the user.
     * 
     *  @return horizontal location. 
     */
    public int getUserCol()
    {
        return userCol;
    }
    
    /**
     * setUserCol sets the horizontal location of the user.
     * 
     * @param uCol is the user column.
     */
    
    public void setUserCol(int uCol)
    {
        userCol = uCol;
    }
    
    /**
     * getGoalCol returns the goal column location.
     * 
     * @return goal column location.
     */
    public int getGoalCol()
    {
        return goalCol;
    }
    
    /**
     * setGoalCol sets the goal column location.
     * 
     * @param goalC is the goal column.
     */
    public void setGoalCol(int goalC)
    {
        goalCol = goalC;
    }
    
    /**
     * getGoalRow returns the goal row location.
     * 
     * @return goal row location.
     */
    public int getGoalRow()
    {
        return goalRow;
    }
    
    /**
     * setGoalRow sets the goal row location.
     * 
     * @param goalR is the goal row.
     */
    public void setGoalRow(int goalR)
    {
        goalRow = goalR;
    }
    
    /**
     * getStartCol returns the start column location.
     * 
     * @return start column location.
     */
    public int getStartCol()
    {
        return startCol;
    }
    
    /**
     * setStartCol sets the start column location.
     * 
     * @param startC is the start column.
     */
    public void setStartCol(int startC)
    {
        startCol = startC;
    }
    
    /**
     * getStartRow returns the start row location.
     * 
     * @return start row location.
     */
    public int getStartRow()
    {
        return startRow;
    }
    
    /**
     * setStartRow sets the start row location.
     * 
     * @param startR is the start row.
     */
    public void setStartRow(int startR)
    {
        startRow = startR;
    }
    
    /**
     * getMoveScanner return the move of the user.
     * 
     * @return move.
     */
    public Scanner getMoveScanner()
    {
        return moveScanner;
    }
    
    /**
     * setMoveScanner sets the move of the user.
     * 
     * @param moveScan is the move of the user.
     */
    public void setMoveScanner(Scanner moveScan)
    {
        moveScanner = moveScan;
    }
      
    
    /**
     * Function loads the data from the maze file and creates the 'blocked' 
     * 2D array.
     *  
     * @param mazeFile the input maze file.
     */
    
    
    private void loadMaze(String mazeFile)
    {
        blocked = new boolean[HEIGHT][WIDTH];
        breadCrumbs = new boolean[HEIGHT][WIDTH];
        
        File file = new File(mazeFile);
        Scanner scanner = null;
        
        try
        {
            scanner = new Scanner(file);
            
        }
        catch (FileNotFoundException e)
        {
           
            System.out.println("No file found");
            System.exit(0);
        }
        
        int r = 0;
        while (r < HEIGHT) 
        {
            
            int c = 0;
            while (c < WIDTH) 
            {
                
                breadCrumbs[r][c] = false;
                String maze_spot = scanner.next();
               
                switch (maze_spot)
                {
                    case "1":
                        blocked[r][c] = false;
                        break;
                    case "0":
                        blocked[r][c] = true;
                        break;
                    case "S":
                        blocked[r][c] = true;
                        setStartCol(c);
                        setUserCol(c);
                        setStartRow(r);
                        setUserRow(r);
                        break;
                    case "G":
                        blocked[r][c] = true;
                        setGoalCol(c);
                        setGoalRow(r);
                        break;
                    default:
                        break;                 
                }
                               
                c++; 
            }
            
            r++;
        
        }
        
    }

    /**
     * Actually plays the game.
     */
    public void playGame()
    {
        setUserRow(getStartRow());
        setUserCol(getStartCol());
        
        Scanner moveScanner = getMoveScanner();
        String userInput = "";
        
        while(userInput != "quit")
        {
            printMaze();
            
            System.out.print("Enter up, down, left, or right to move: ");
            
            userInput = moveScanner.next();
            
            System.out.println();
            
            makeMove(userInput);
            
            if(playerAtGoal())
            {
                System.out.println("Awesome! You have finished the maze!");
                userInput = "quit";
            }
        }
    }

    /**
     * Checks to see if the player has won the game.
     * @return true if the player has won.
     */
    // TODO: public boolean playerAtGoal()
    
    public boolean playerAtGoal()
    {
        return (userRow == goalRow) && (userCol == goalCol);
    }
    
    
    /**
     * Makes a move based on the String.
     * 
     * @param move
     *            the direction to make a move in.
     * @return whether the move was valid.
     */
    public boolean makeMove(String move)
    {
        String m = move;

        int userRow = getUserRow();
        int userCol = getUserCol();
        
        if(m == "up")
        {
            int move1 = userRow - 1; 
            
            if (userRow > 0 && blocked [move1][userCol] 
                && blocked[userRow][userCol])
            {
                setUserRow(move1);
                breadCrumbs[move1][userCol] = true;
                return true;
            }
            return false;
        }
        else if (m == "down")
        {
            int move2 = userRow + 1;
            
            if (userRow < HEIGHT - 1 && blocked[move2][userCol] 
                && blocked[userRow + 1][userCol])
            {
                setUserRow(move2);
                breadCrumbs[move2][userCol] = true;
                return true;
            }
            return false;
        }
        else if (m == "right")
        {
            int move3 = userCol + 1;
            
            if (userCol < WIDTH - 1 && blocked[userRow][move3])
            {
                setUserCol(userCol + 1);
                breadCrumbs[userRow][move3] = true;
                return true;
            }
            return false;           
        }
        else if (m == "left")
        {
            int move4 = userCol - 1;
            
            if (userCol > 0 && blocked[userRow][move4])
            {
                setUserCol(userCol - 1);
                breadCrumbs[userRow][move4] = true;
                return true;
            }
            return false;
        }
        
        return false;
        
    }

    
    
    /**
     * printMaze prints a map of the maze.
     * 
     */
    public void printMaze()
    {
       

        System.out.print("*");
        
        for (int c = 0; c < WIDTH; c++)
        {
            
            System.out.print("-");
            
        }
        
        System.out.println("*");
        
        int r = 0;
        while ( r < HEIGHT)
        {
            
            System.out.print("|");
            
            int c = 0;
            while ( c < WIDTH)
            {
                if (r == userRow && c == userCol)
                {
                    
                    System.out.print("@");
                    
                }
                else if (r == goalRow && c == goalCol)
                {
                    
                    System.out.print("G");
                    
                }
                else if (r == startRow && c == startCol)
                {
                    
                    System.out.print("S");
                    
                }
                else if (breadCrumbs[r][c] == true)
                {
                    
                    System.out.print(".");
                    
                }
                else if (blocked[r][c] == true)
                {
                    
                    System.out.print(" ");
                    
                }
                else if (blocked[r][c] == false)
                {
                    
                    System.out.print("X");
                    
                }
                c++;
               
            }
            r++;
            System.out.println("|");
        }
        System.out.print("*");
        
        for (int c = 0; c < WIDTH; c++)
        {
            
            System.out.print("-");
        }
            
        
        System.out.println("*");
    }

    /**
     * Creates a new game, using a command line argument file name, if one is
     * provided.
     * 
     * @param args the command line arguments
     */

    public static void main(String[] args)
    {
        String mapFile = "data/easy.txt";
        Scanner scan = new Scanner(System.in);
        MazeGame game = new MazeGame(mapFile, scan);
        game.playGame();
    }
}
