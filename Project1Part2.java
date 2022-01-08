/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1.part.pkg2;

/**
 *
 * @author trent
 */

    import java.util.*;

public class Project1Part2 {

    public static String computerChoice(){
    Random rand = new Random();    
    int lime = 3;
    int cpu_decision = rand.nextInt(lime); 
  
    String Cpu_Action = "";
    
    switch(cpu_decision){
        case 0 -> {
            Cpu_Action = "Rock";
        }
        case 1 -> {
            Cpu_Action = "Paper";
        }
        case 2 -> {
            Cpu_Action = "Scissors";
        }
    }
        return Cpu_Action;
    }
    //end of computer's Choice method

    public static String userChoice(){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Ok, now enter your decision.... Rock, Paper or Scissors.... Choose wisely...");
    String user_decision = scnr.nextLine(); 
    return user_decision;
    }
    //end of user choice
    
    public static String isValidChoice (String choice){
    Scanner scnr = new Scanner(System.in);
    String valid ="";    
   while (!choice.equals("Rock") && !choice.equals("Paper") && !choice.equals("Scissors")){
      System.out.println("Well then... it looks like you didn't enter Rock, Paper or Scissors.... Let's try entering that in again"); 
      choice = scnr.nextLine();
    }
   if(choice.equals("Rock") || choice.equals("Paper") || choice.equals("Scissors"))
     {
      valid = choice;
    }
    System.out.println("You picked a valid option: " + valid);
    return valid;
    }
    
    public static void determineWinner(String computer, String user){
     Scanner scnr = new Scanner(System.in); 
      if(computer.equals(user)){
     String CPU = computerChoice();
          System.out.println("We drew....");
          
          System.out.println("Let's play again, there can only be one winner >:)");
          System.out.println("Ok.. Pick Rock, Paper or Scissors.");
          String Me = scnr.nextLine();
          
          System.out.println("Your input is: " + Me + " | The computer put: " + CPU);
         String valid = isValidChoice(Me);
          determineWinner(CPU, valid);
      }  
      else if(computer.equals("Rock") && user.equals("Paper")){
          System.out.println("You win.... this time...");
      }
      else if(computer.equals("Rock") && user.equals("Scissors")){
          System.out.println("Computer wins");
    }
      else if(computer.equals("Paper") && user.equals("Scissors")){
          System.out.println("You win.... this time...");
    }  
      else if(computer.equals("Paper") && user.equals("Rock")){
          System.out.println("Computer wins");
    }  
      else if(computer.equals("Scissors") && user.equals("Rock")){
          System.out.println("You win... this time...");
    }  
      else if(computer.equals("Scissors") && user.equals("Paper")){
          System.out.println("Computer wins");
    }  
      //Probably able to compress the scenarios to using one elseif statement for win condition and use else as a statement stating that it is a loss..
      System.out.println("");
    }
    
    public static void main(String[] args) {  
   
        Scanner crumb = new Scanner(System.in);
        System.out.println("Let's play some rock, paper, scissors. Enter Y to play and N to stop/not play");
        String play = crumb.nextLine();
 
        while(!play.equals("Y") && !play.equals("N")){
        System.out.println("Sorry I didn't quite get that.. use Y to play or N to stop");
        play = crumb.nextLine();
        }
        
        while(play.equals("Y")){
        String user = userChoice(); 
        String computer = computerChoice();
        
        System.out.println("Your current input is: " + user);
        
        String valid = isValidChoice(user);
        
        System.out.println("Your input is: " + valid + " | The computer put: " + computer);
       
        determineWinner(computer, valid);
       
        System.out.println("Would you like to go another round? Type Y for yes and literally anything else for no.");
        play = crumb.nextLine();       
        }
            
        if(!play.equals("Y")){
        System.out.println("CY@");
            System.exit(0);
        }

    }
    
}

