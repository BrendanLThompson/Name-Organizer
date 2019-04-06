//Brendan Thompson
//Project 2: Last Name, First Name Middle Initial.
//Due: Feburary 26, 2019 5:30 p.m
import java.util.Scanner;
public class ThompsonBProj2COMP110
{
   public static void main(String[]args)
   {
    Scanner input = new Scanner(System.in);
       
    System.out.println ("Brendan Thompson, Project 2");
    System.out.println (" ");
     
   //input line
   System.out.println("Whats your name?");
   String name = input.nextLine();
   
   //reading spaces for each part of the name
   int Space = name.indexOf(" ");
   
   if (Space >= 0)
      { 
       int Space2 = name.indexOf(" ", Space + 1);
       
       //first name
       String firstName = name.substring(0, 1).toUpperCase() + name.substring(1, Space); 
       firstName = name.substring(0,1).toUpperCase() + name.substring(1,Space).toLowerCase();
       
         if (Space2 >= 0)
         {
          //middle initial
          String midName = name.substring(Space + 1, Space2); 
          midName = name.substring(Space + 1, Space2).toUpperCase();
          
          //last name if middle me is present
          String lastName = name.substring(Space2 + 1);
          lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1).toLowerCase();
       
          System.out.println (lastName + ", " + firstName + " " + midName.charAt(0) + ".");
         } 
         
         else
         {
          //last name
          String lastName = name.substring(Space + 1);
          lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1).toLowerCase();
      
          System.out.println (lastName + ", " + firstName);         
         }
      }  
   else
      {
       //Full name not inputed  
       System.out.println ("Please enter your full name.");
      }          
   
    System.out.println (" ");   
    System.out.println ("Brendan Thompson, End of Project 2");
   
    }
}  