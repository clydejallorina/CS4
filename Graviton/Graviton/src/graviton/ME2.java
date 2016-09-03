package graviton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Clyde Jallorina (@clydejallorina)
 */ 
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ME2 {
    public static void main(String[] args) throws Exception{
	while(true){
	/*	
	Create a java program in main asking which of the following will be executed:
			
	1) sum
	2) average
	3) sum of squares
	4) square of sum
	5) average of squares
	6) square of average
	7) sum of cubes
	8) cube of sum
	9) average of cubes
	10) cube of average
	11) exit
        Then, it will ask for 2 double-point numbers as an input. The output will depend on the 
	chosen task.
	Take into consideration negative integers.
	Print "Invalid Input!" for invalid user input. It will ask the user to once again enter a valid input
	The program will only terminate when exit is chosen. Hint: use break
	Use BufferedReafer instead of Java scanner.
	*/
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String input = reader.readLine();
        int var1, var2, var3 = 0;
        boolean quit = false;
        
            while (true)
            {
                System.out.print("Set Variable 1: ");
                String input = reader.readLine();
                var1 = 0;
                try {
                    var1 = Integer.parseInt(input);
                    System.out.println("Variable 1: " + var1);
                }
                catch (Exception error) {
                    System.out.println("Error Detected!");
                }
                break;
            }
            while (true)
            {
                System.out.print("Set Variable 2: ");
                String input = reader.readLine();
                var2 = 0;
                try {
                    var2 = Integer.parseInt(input);
                    System.out.println("Variable 2: " + var1);
                }
                catch (Exception error) {
                    System.out.println("Error Detected!");
                }
                break;
            }
            
            while (true)
            {
                System.out.print("Set Operation: ");
                String input = reader.readLine();
                var3 = 0;
                try {
                    var3 = Integer.parseInt(input);
                    System.out.println("Variable 3: " + var3);
                }
                catch (Exception error) {
                    System.out.println("Error Detected!");
                }
                break;
            }
            
            switch (var3)
            {
                case 1:
                    //Sum
                    System.out.println("Sum: " + (var1 + var2));
                    break;
                case 2:
                    //Average
                    System.out.println("Average: " + ((var1 + var2) / 2));
                break;
                case 3:
                    //Sum of Squares
                    System.out.println("Sum of Squares: " + ((var1 * var1) + (var2 * var2)));
                break;
                case 4:
                    //Square of Sum
                    System.out.println("Square of Sum: " + ((var1 + var2) * (var1 + var2)));
                break;
                case 5:
                    //Average of Squares
                    System.out.println("Average of Squares: " + (((var1 * var1) + (var2 * var2)) / 2));
                break;
                case 6:
                //Square of Average
                System.out.println("Square of Average: " + (((var1 + var2) / 2) * ((var1 + var2) / 2)));
                break;
                case 7:
                //Sum of Cubes
                System.out.println("Sum of Cubes: " + ((var1 * var1 * var1) + (var2 * var2 * var2)));
                break;
                case 8:
                //Cube of Sum
                System.out.println("Cube of Sum: " + ((var1 + var2) * (var1 + var2) * (var1 + var2)));
                break;
                case 9:
                //Average of Cubes
                System.out.println("Average of Cubes: " + (((var1 * var1 * var1) + (var2 * var2 * var2)) / 2));
                break;
                case 10:
                //Cube of Average
                System.out.println("Cube of Average: " + (((var1 + var2) / 2)) * ((var1 + var2) / 2) * ((var1 + var2) / 2));
                break;
                
                case 11:
                    //Exit?
                    System.out.println("Exitting Program...");
                    quit = true;
                break;
                default:
                    System.out.println("Please input a value between 1 and 11. Program restarting...");
            }
            
            if (quit)
                break;
        }
    }
}