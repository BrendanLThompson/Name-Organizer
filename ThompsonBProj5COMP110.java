//Brendan Thompson
//Project 5: Last Name, First Name Middle Initial with trim().
//Due: April 30, 2019 5:30 p.m
import java.util.Scanner;
public class ThompsonBProj5COMP110
{
   public static void main(String[]args)
   {
   System.out.println ("Brendan Thompson, Project 5");
   System.out.println (" ");
   
   //Input and Trim
   Scanner input = new Scanner(System.in); 
   System.out.println("Whats your name?");
   String name = input.nextLine();
   name = name.trim();
   
   //Detects how many spaces 
   int Space = name.indexOf(" ");
   int Space2 = name.indexOf(" ", Space + 1); 
    
   //Checking if the name has a Middle name or not, and printing
   if (Space >= 0)
      { 
      FIRSTNAME(name, Space, Space2);
         if (Space2 >= 1)
         {
         MIDDLENAME(name, Space, Space2); 
         LASTNAME(name, Space, Space2);
         System.out.println (LASTNAME1(name, Space, Space2) + ", " + FIRSTNAME(name, Space, Space2) + " " + MIDDLENAME(name, Space, Space2) + ".");
         } 
         else
         {
         LASTNAME1(name, Space, Space2); 
         System.out.println (LASTNAME(name, Space, Space2) + ", " + FIRSTNAME(name, Space, Space2));        
         }
      }  
   else
      {  
      System.out.println ("Please enter your full name.");
      } 
      
   System.out.println (" ");   
   System.out.println ("Brendan Thompson, End of Project 5");             
   }
   
   //First Name
   public static String FIRSTNAME(String name, int Space, int Space2)
   {
   name = name.trim();
   String firstName = name.substring(0, 1).toUpperCase() + name.substring(1, Space); 
   firstName = name.substring(0,1).toUpperCase() + name.substring(1,Space).toLowerCase();
   return firstName;
   }
   
   //Middle Name
   public static String MIDDLENAME(String name, int Space, int Space2)
   {
   String midName = name.substring(Space + 1, Space + 2); 
   midName = name.substring(Space + 1, Space + 2).toUpperCase();
   return midName;
   }
   
   //Last Name (if Middle Name is present)
   public static String LASTNAME(String name, int Space, int Space2)
   {
   name = name.trim();
   String lastName = name.substring(Space + 1);
   lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1).toLowerCase();
   return lastName;
   }
   
   //Last Name (if Middle Name isn't present)
   public static String LASTNAME1(String name, int Space, int Space2)
   {
   name = name.trim();
   String lastName = name.substring(Space2 + 1);
   lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1).toLowerCase();
   return lastName;
   }
}
