/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graviton;

/**
 *
 * @author Clyde Jallorina (@clydejallorina)
 * This class contains all the functions and variables required for
 * the creation of a Hero for ME4.
 */
public class Hero {
    private int HP; 
    private int AP; 
    private int MP; 
    int strength;
    int agility;
    int intelligence;
    int atk;
    String team;
    String name;
    
    /**
     * Constructor of the class
    */
    public Hero() {
        this.team = "Humans";
        this.intelligence = 0;
        this.agility = 0;
        this.strength = 0;
        this.MP = 0;
        this.AP = 0;
        this.HP = 0;
        this.atk = 0;
        this.name = "defaultName";
    }
    
    /**
     * Prints attributes (team, MP, AP, HP, name, primary)
     */
    public void printAttr() {
        System.out.println("------------------------------------");
        System.out.println("             Team: " + this.team);
        System.out.println("------------------------------------");
        System.out.println("             Name: " + this.name);
        System.out.println("               HP: " + getHP());
        System.out.println("               AP: " + getAP());
        System.out.println("               MP: " + getMP());
        System.out.println("------------------------------------");
        System.out.println("         Strength: " + this.strength);
        System.out.println("          Agility: " + this.agility);
        System.out.println("     Intelligence: " + this.intelligence);
        System.out.println("------------------------------------");
        System.out.println("Primary Attribute: " + getPrimaryAtr());
        System.out.println("    Attack Damage: " + this.atk);
    }
    
    /**
     * Calculates HP from strength
     * @return HP
     */
    public int getHP() {
        this.HP = this.strength * 19;
        return HP;
    }
    
    /**
     * Calculates AP from agility
     * @return AP
     */
    public int getAP() {
        this.AP = this.agility / 7;
        return AP;
    }
    
    /**
     * Calculates MP from intelligence
     * @return MP
     */
    public int getMP() {
        this.MP = this.intelligence * 13;
        return MP;
    }
    
    /**
     * Calculate Primary Attribute
     * @return Primary Attribute
     */
    public String getPrimaryAtr() {
        if (this.strength > this.agility)
        {
            if (this.strength > this.intelligence)
            {
                atk = this.strength;
                return "Strength";
            }
            else
            {
                atk = this.intelligence;
                return "Intelligence";
            }
        }
        else
        {
            if (this.agility > this.intelligence)
            {
                atk = this.agility;
                return "Agility";
            }
            else
            {
                atk = this.intelligence;
                return "Intelligence";
            }
        }
    }
    
    public void setTeam(int teamID) {
        switch (teamID)
        {
            case 1:
                this.team = "Sentinel";
                break;
            case 2:
                this.team = "Scourge";
                break;
            default:
                this.team = "Team unsettled.";
        }
    }
}