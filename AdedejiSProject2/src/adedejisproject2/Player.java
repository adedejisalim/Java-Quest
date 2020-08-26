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
public abstract class Player {
    private int health = 20;
    private int score = 0;
    
    public int getHealth(){
        return this.health;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public void incHealth(){
        this.health += 1;
    }
    
    public void incScore(){
        this.score += 1;
    }
    
    public void decHealth(){
        this.health -= 1;
    }
    
    public abstract String getSpecialMove();
    public abstract void useSpecialMove();
    
   
}
