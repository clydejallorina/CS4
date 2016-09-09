/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graviton;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Clyde Jallorina (@clydejallorina)
 * Requirements: Hero.java
 */
public class ME4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Hero hero1 = new Hero();
        String input;
        
        System.out.println("Hero Maker 100");
        System.out.println("--------------");
        System.out.println("Team: 1 - Sentinel");
        System.out.println("      2 - Scourge");
        System.out.print("Input Team ID: ");
        input = reader.readLine();
        hero1.setTeam(Integer.parseInt(input));
        System.out.print("Hero Name: ");
        input = reader.readLine();
        hero1.name = input;
        System.out.println("-------------------------");
        System.out.print("    Strength: ");
        input = reader.readLine();
        hero1.strength = Integer.parseInt(input);
        System.out.print("     Agility: ");
        input = reader.readLine();
        hero1.agility = Integer.parseInt(input);
        System.out.print("Intelligence: ");
        input = reader.readLine();
        hero1.intelligence = Integer.parseInt(input);
        
        hero1.printAttr();
    }
}
