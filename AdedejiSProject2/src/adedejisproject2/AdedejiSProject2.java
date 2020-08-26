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

import java.util.*;
import java.io.*;

public class AdedejiSProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create lists to store values that would be iterated through
        String[] foes = {"zombie","bandit","lobbyist"};
        String[] scene = {"Nothing here...", "Nice trees around here...", "Interesting cottage there...", "Potty break..."};
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Player p = new Wizard();
        
        System.out.println("Welcome to JavaQuest!\nStay alive and increase your score!");
        System.out.println("Choose a character...");
        System.out.print("{k}Knight || {h}Healer ||{w}Wizard ||{t}Thief \n>>");
        String character = input.next().toLowerCase();
        
        //selection structure to print appropriate welcome header
        switch(character){
            case "k":
                p = new Knight();
                System.out.println();
                System.out.println("Welcome, Knight!");
                break;
            case "h":
                p = new Healer();
                System.out.println("\nWelcome, Healer!");
                break;
            case "w":
                p = new Wizard();
                System.out.println("\nWelcome, Wizard!");
                break;
            case "t":
                p = new Thief();
                System.out.println("\nWelcome, Thief!");
                break;
            default: 
                p = new Wizard();
                System.out.println("\nWelcome, Knight!");
        }
        
        System.out.println("\nWhat would you like to do?");
        System.out.println("{?}Status Report || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit ");
        System.out.print(">>");
        
        String user_input = input.next().toLowerCase();
        
        //while loop to keep on running until conditions are met
        while ((!user_input.equals("q")) && (p.getHealth() > 0))
            if ((!user_input.equals("?")) && (!user_input.equals("n")) && (!user_input.equals("s")) && (!user_input.equals("e")) && (!user_input.equals("w")) && (!user_input.equals("q"))) {
                System.out.println("\nNot a valid choice. Try again.");
                System.out.println(">>");
                user_input = input.next().toLowerCase();
                    
            }else if (user_input.equals("?")){
                System.out.println(p);
                System.out.println("\nWhat would you like to do?");
                System.out.println("{?}Status Report || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit ");
                System.out.print(">>");
                user_input = input.next().toLowerCase();
                
            }else{
                int move = rand.nextInt(5);
                if (move < 4){
                    System.out.println();
                    System.out.println("**********************");
                    System.out.println(scene[move]);
                    System.out.println("**********************");
                    p.incScore();

                }else{
                    //conditions for when being attacked
                    System.out.println();
                    System.out.println("Oh no! You are being attacked by a " + foes[rand.nextInt(3)] + "!");
                    System.out.println("How would you like to handle this?");
                    System.out.println("{s}Special Move || {r}Run!");
                    System.out.print(">>");

                    String handle = input.next();

                    if(handle.equals("r")){
                        if(rand.nextInt() % 2 == 0){
                            System.out.println("You successfully escaped");
                            p.incScore();
                            System.out.println("\nWhat would you like to do?");
                            System.out.println("{?}Status Report || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit ");
                            System.out.print(">>");
                            user_input = input.next().toLowerCase();
                            continue;
                        }
                        System.out.println("Flee attempt unsuccessful!");
                    }
                    System.out.println("Prepare for battle!");
                    System.out.println("Press any letter then ENTER to continue...");
                    input.next();
                    System.out.println(battle(p));
                    System.out.println(p);
                    if(p.getHealth() <= 0){
                        System.out.println("Sorry, you ran out of health!");
                        break;
                    }
                }
                System.out.println("\nWhat would you like to do?");
                System.out.println("{?}Status Report || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q}Quit ");
                System.out.print(">>");
                user_input = input.next().toLowerCase();
            }
                
                System.out.println();
                System.out.println("****************************");
                System.out.println("****************************");
                System.out.println("The game has come to an end! Your final stats:" );
                System.out.println(p);
                System.out.println("Thanks for playing!");



        }
        
            
    
    
    //create 'battle' method to decided wins or losses in a randomized manner
    public static String battle(Player p){
        Random rand = new Random();
        System.out.println("******************************");
        p.useSpecialMove();
        int attack = rand.nextInt(200);
        if (attack > 110){
            p.incScore();
            p.incScore();
            return "Player wins! Increase score by 2 points!";
        }else{
            p.decHealth();
            return "Player loses! Lose 1 health point!";
        }
       }
}
