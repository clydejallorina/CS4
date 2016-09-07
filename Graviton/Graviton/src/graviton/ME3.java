/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graviton;

/**
 *
 * @author Clyde Jallorina (@clydejallorina)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ME3{
    /**
     *
     * @param x1 x part of the first line
     * @param x2 y part of the first line
     * @param y1 x part of the second line
     * @param y2 y part of the second line
     * @return the slope
     */
    public static double slope(int x1, int x2, int y1, int y2){
        /*
	The slope of the line that passes through points (x1,y1) and (x2,y2) is:
					(y2 - y1)/(x2 - x1)
	
	Write a Java method that asks user for the values x1, y1, x2, y2 and returns 
	the slope of the line passing through the points (x1,y1) and (x2,y2).
	Use BufferedReafer instead of Java scanner.
        */
        double theSlope = 0;
        double Dx1 = (double) x1;
        double Dx2 = (double) x2;
        double Dy1 = (double) y1;
        double Dy2 = (double) y2;
        if ((Dx2 - Dx1) != 0)
        {
            theSlope = (Dy2 - Dy1) / (Dx2 - Dx1);
        }
	return theSlope;
    }
    
    public static boolean isLeap(int year){
	/*
	Leap year
	A year is a leap year if it is divisible by 4 but not by 100, except that it can be divisible by 400.
	Write a Java methd that asks for a year from the user. It will determine if a given year is a leap year.
	Use BufferedReafer instead of Java scanner.
        */
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                return (year % 400 == 0);
            }
            return true;
        }
        return false;
    }
    
    public static float finalgwa(float grade){
        /*
        General Weighted Average
	Write a method that will display the corresponding final grade of a student given the general weighted average. Use the following table for reference:
	92-100		1.0
	88-91		1.25
	85-87		1.50
	82–84		1.75
	78-81		2.00
	74-77		2.25
	70-73		2.50
	65-69		2.75
	60-64		3.00
	below 60	5.00
        */
	float gwa = (float) 1.0;
        int roundedGrade = Math.round(grade);
        if (roundedGrade >= 92 && roundedGrade <= 100)
        {
            gwa = (float) 1.00;
        }
        else if (roundedGrade >= 88 && roundedGrade <= 91)
        {
            gwa = (float) 1.25;
        }
        else if (roundedGrade >= 85 && roundedGrade <= 87)
        {
            gwa = (float) 1.5;
        }
        else if (roundedGrade >= 82 && roundedGrade <= 84)
        {
            gwa = (float) 1.75;
        }
        else if (roundedGrade >= 78 && roundedGrade <= 81)
        {
            gwa = (float) 2.00;
        }
        else if (roundedGrade >= 74 && roundedGrade <= 77)
        {
            gwa = (float) 2.25;
        }
        else if (roundedGrade >= 70 && roundedGrade <= 73)
        {
            gwa = (float) 2.5;
        }
        else if (roundedGrade >= 65 && roundedGrade <= 69)
        {
            gwa = (float) 2.75;
        }
        else if (roundedGrade >= 60 && roundedGrade <= 64)
        {
            gwa = (float) 3.00;
        }
        else
        {
            gwa = (float) 5.00;
        }
	return gwa;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int x1, y1, x2, y2 = 0;
        int year = 0;
        float grade = (float) 0.0;
        
        System.out.print("Input x1: ");
        String input = reader.readLine();
        x1 = Integer.parseInt(input);
        System.out.print("Input y1: ");
        input = reader.readLine();
        System.out.print("Input x2: ");
        y1 = Integer.parseInt(input);
        input = reader.readLine();
        x2 = Integer.parseInt(input);
        System.out.print("Input y2: ");
        input = reader.readLine();
        y2 = Integer.parseInt(input);
        System.out.println("Slope: " + slope(x1, x2, y1, y2));
        
        System.out.print("Input Year: ");
        input = reader.readLine();
        year = Integer.parseInt(input);
        if (isLeap(year))
        {
            System.out.println("It's a leap year!");
        }
        else
        {
            System.out.println("It's not a leap year!");
        }
        
        System.out.print("Input Grade [0-100]: ");
        input = reader.readLine();
        grade = Float.parseFloat(input);
        System.out.println("GWA: " + finalgwa(grade));
    }
}