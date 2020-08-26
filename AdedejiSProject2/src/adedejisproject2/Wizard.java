/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adedejisproject2;

/**
 *
 * @author s534027
 */
public class Wizard extends Player{
    public String getSpecialMove(){
        return "\nThe Wizard's special move is 'Cast a Spell'";
    }
    
    public void useSpecialMove(){
        System.out.println("The Wizard casts a spell!");
    }
    
     @Override
    public String toString(){
        return "\nWizard Status:" + "\nHealth: " + getHealth() + "\nScore: " + getScore() + "\n" + getSpecialMove();
    }
}
