import java.util.Scanner;

public class Meteorology{
   public static void main(String [] args){
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Meteorology Program");
      System.out.println("Make a selection and press return:");
      String selection = keyboard.nextLine();  
      while(selection !="7"){
            
         System.out.println("1. Record a temperature reading.");
         System.out.println("2. Record a pressure reading.");
         System.out.println("3. Record a humidity reading.");
         System.out.println("4. Print maximum values.");
         System.out.println("5. Print minimum values.");
         System.out.println("6. Print average values");
         System.out.println("7. Quit");
         
         if(selection == "1"){
            System.out.println("Enter value:");
            String temp = keyboard.nextLine();
         } 
         
         if(selection == "2"){
            System.out.println("Enter value:");
            String press = keyboard.nextLine();
         }
               
               
         if(selection == "3"){
            System.out.println("Enter value:");
            String hum = keyboard.nextLine();
         }
         
         if(selection == "4"){
            System.out.println("Maximum Temperature: " + temp);
            System.out.println("Maximum Pressure: " + press);
            System.out.println("Maximum Humidity :" + hum);
            
         }
         
         if(selection == "5"){
            System.out.println("Minimum Temperature: " + temp);
            System.out.println("Minimum Pressure: " + press);
            System.out.println("Minimum Humidity :" + hum);
         }
         
         if(selection == "6"){
            System.out.println("Average Temperature: " + temp);
            System.out.println("Average Pressure: " + press);
            System.out.println("Average Humidity :" + hum);
         }else {break;}         
         
       }  
      }
   }