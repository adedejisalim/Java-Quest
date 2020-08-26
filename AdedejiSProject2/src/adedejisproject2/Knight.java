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
public class Knight extends Player{
    public String getSpecialMove(){
        return "\nThe Knight's special move is 'Slash with Sword'";
    }
    
    public void useSpecialMove(){
        System.out.println("The Knight slashes with his sword!");
    }
    
     @Override
    public String toString(){
        return "\nKnight Status:" + "\nHealth: " + getHealth() + "\nScore: " + getScore() + "\n" + getSpecialMove();
    }
}
