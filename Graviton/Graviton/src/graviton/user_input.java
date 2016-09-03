/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graviton;

/**
 *
 * @author guest16
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class user_input{
    public static void main(String[] args) throws Exception {
        System.out.println("hello");
		
        //Input with Scanner
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("number:" + num1);

        //Input with Buffered Reader

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        double number = Double.parseDouble(input);
        System.out.println(input + ": (sqrt)" + Math.sqrt(number));
	    

        reader.close();
    }
}
