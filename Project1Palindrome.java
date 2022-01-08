/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1palindrome;

/**
 *
 * @author trent
 */
import java.util.*;
public class Project1Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);
System.out.println("Please enter in the word, phrase or sentence you would like to check. Entering an empty input will end the program..");
 String Test = scnr.nextLine();

 int begin, end;
 begin = 0;
 end = Test.length() - 1;
 
 while(begin < end){
     while(Test.charAt(begin) == ' '){
         begin++;
     }
     while(Test.charAt(end) == ' '){
         end--;
     }
     if (Test.charAt(begin) == Test.charAt(end)){
         begin++;
         end--;
     }
     else{
         break;
     }
     }
 if(begin >= end){
     System.out.println( Test + " is a palindrome.");
 }    
 else{
     System.out.println( Test + " is not a palindrome.");
 }
 }
   
    }
    

