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
public class Healer extends Player{
    public String getSpecialMove(){
        return "\nThe Healer's special move is 'Use Sleeping Powder'";
    }
    
    public void useSpecialMove(){
        System.out.println("The Healer uses Sleeping Powder!");
    }
    
     @Override
    public String toString(){
        return "\nHealer Status:" + "\nHealth: " + getHealth() + "\nScore: " + getScore() + "\n" + getSpecialMove();
    }
}
