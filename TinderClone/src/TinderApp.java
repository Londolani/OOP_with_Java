import java.util.Scanner;
import java.util.*;
import java.io.*;

public class TinderApp{
   public static void main(String [] args){
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("\nWELCOME TO BASIC JAVA TINDER CLONE!\n");
      System.out.println("Please enter your prefence. m for Male, f for Female or n for no Preference ?");
      String preference = keyboard.nextLine();
      
      System.out.println("Awesome, you have selected a preference of: "+ preference);
        

      //I know how to call a created class object
      TinderSwipe ts = new TinderSwipe();  
      
      //System.out.println(ts.getProfilesByPreference(preference));
      
      ArrayList<Profile> displayProfiles = ts.getProfilesByPreference(preference);
      Iterator<Profile> iterator = displayProfiles.iterator();
      
      //System.out.println();
      
      //String userInput = keyboard.nextLine();
       
      String userInput;
           
      while(iterator.hasNext()){
         Profile nextProfile = iterator.next();
         System.out.println(nextProfile);
         System.out.println("\nSwipe (r) right or (l) left. Press (q) to quit app\n");
         userInput = keyboard.nextLine();
         if(userInput.toUpperCase().equals("R")){
            System.out.println("You swiped right\n");
            ts.submitProfileToDB(nextProfile);
         }
         if(userInput.toUpperCase().equals("L")){
            System.out.println("You swiped left\n");
         }
         if(userInput.toUpperCase().equals("Q")){ 
            System.out.println("\n\nThank you so much for using Tinder App");
            break;
         }
      }
   }
}