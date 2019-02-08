import java.util.Scanner;
import java.io.*;

public class Lab4Intake{
	static int ROWS = 4;
	static int COLS = 4;
	public static int[][] matrix = new int[ROWS][COLS];
	public static int[][] m2 = new int[ROWS][COLS];
	public static int[][] m3 = new int[ROWS][COLS];
	public static int[][] m4 = new int[ROWS][COLS];
   public static void main(String[] args){
	   main();
   }
     
public static void main() {
	 Scanner infile = null;
     try{
        infile = new Scanner(new File("Unit 5\\MatrixValues.txt")); //intro file to allow you to see how this works
     }
     catch(FileNotFoundException e){
        System.out.println("Error: MatrixValues.txt not found. Exiting program.");
        System.exit(0);
     }
     
     /*****************************
     *Evertying below this point will be redone by you,
     *but it gives you an idea how to use file input.
     ****************************/
       
     //loops to read from file
     for(int r = 0; r < ROWS; r++){
        for(int c = 0; c < COLS; c++){
           matrix[r][c] = infile.nextInt();
        }
     }
 
     //loops to output from file
     for(int r = 0; r < ROWS; r++){
        for(int c = 0; c < COLS; c++){
           System.out.print(matrix[r][c] + " ");
        }
        System.out.println();
     }
    System.out.println("Matrix 1__________________________________");
    for(int r = 0; r < ROWS; r++){
        for(int c = 0; c < COLS; c++){
           m2[r][c] = infile.nextInt();
        }
     }
 
     //loops to output from file
     for(int r = 0; r < ROWS; r++){
        for(int c = 0; c < COLS; c++){
           System.out.print(m2[r][c] + " ");
        }
        System.out.println();
     }
    System.out.println("Matrix 2___________________________________");
    for(int r = 0; r < ROWS; r++){
        for(int c = 0; c < COLS; c++){
           m3[r][c] = infile.nextInt();
        }
     }
 
     //loops to output from file
     for(int r = 0; r < ROWS; r++){
        for(int c = 0; c < COLS; c++){
           System.out.print(m3[r][c] + " ");
        }
        System.out.println();
     }
    System.out.println("Matrix 3_________________________________");
    for(int r = 0; r < ROWS; r++){
        for(int c = 0; c < COLS; c++){
           m4[r][c] = infile.nextInt();
        }
     }
 
     //loops to output from file
     for(int r = 0; r < ROWS; r++){
        for(int c = 0; c < COLS; c++){
           System.out.print(m4[r][c] + " ");
        }
        System.out.println();
     }
    System.out.println("Matrix 4_________________________________");
  }
	// TODO Auto-generated method stub
	
}
