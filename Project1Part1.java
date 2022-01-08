/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1.part.pkg1;

/**
 *
 * @author trent
 */
    import java.util.Scanner;

public class Project1Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner scnr = new Scanner(System.in);
  
    //Reading user input
    System.out.println("Please enter in a month between 1-12, 1-12!");
    int Month = scnr.nextInt();
    
    //Checking if valid month
    if(Month > 12 || Month < 1){
      System.out.println("Hey, come on individual... I told you to put a month between 1-12 not an abitrary number like that >:(((");
      System.exit(0); }
    //Checking if valid month
    
    System.out.println("Please enter in a day for the given month :)))");
    int Day = scnr.nextInt();
      if(Day > 31 || Day < 1){
      System.out.println("Hey, come on individual... why you putting in these jank values >:(");
      System.exit(0); }
    //Reading user input
    
    System.out.println("It looks like the date you have given me is.. " + Month + "/" + Day);
    
    String Season;
    
    switch(Month){
        case 1 -> {
            Season = "Winter"; System.out.println("The given date is " + Season);
            }
        case 2 -> {
            Season = "Winter"; System.out.println("The given date is " + Season);
            }
        case 3 -> {
            if(Day < 21); Season = "Winter";
            if (Day > 20 && Day <= 31)  Season = "Spring";
            System.out.println("The given date is " + Season);
            }
        case 4 -> {
            System.out.println("The given date is Spring");
        }
        
        case 5 -> {
            System.out.println("The given date is Spring");

        }
        
        case 6 -> {
            if(Day < 21); Season = "Spring";
            if (Day > 20 && Day <= 31) Season = "Summer";
            System.out.println("The given date is " + Season);
            }
        
        case 7 -> {
          System.out.println("The given date is Summer");
        }
          
        case 8 -> {
          System.out.println("The given date is Summer");

        }
        
        case 9 -> {
            if(Day <= 20); Season = "Summer";
            if (Day > 20 && Day <= 31) Season = "Fall";
            System.out.println("The given date is " + Season);  
        }
        
        case 10 -> {
            System.out.println("The given date is in Fall");
        }
        
        case 11 -> {
            System.out.println("The given date is in Fall");

        }
        
        case 12 -> {
            if(Day <= 20); Season = "Fall";
            if (Day > 20 && Day <= 31)  Season = "Winter";
            System.out.println("The given date is " + Season); 
        }
        
        }
        
    }
    


    
    
    
    }
   

