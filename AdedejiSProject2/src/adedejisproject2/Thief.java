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
public class Thief extends Player{
    public String getSpecialMove(){
        return "\nThe Thief's special move is 'Sneak By'";
    }
    
    public void useSpecialMove(){
        System.out.println("The Thief tries to Sneak By!");
    }
    
     @Override
    public String toString(){
        return "\nThief Status:" + "\nHealth: " + getHealth() + "\nScore: " + getScore() + "\n" + getSpecialMove();
    }
}
