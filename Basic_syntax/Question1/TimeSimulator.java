import java.util.Scanner;

public class TimeSimulator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a time ([h]h:mm [am|pm]):");
    String timeValue = keyboard.nextLine();
    String[] splitByColon = timeValue.split(":");
    int hoursValue = Integer.parseInt(splitByColon[0]);

    String[] splitForMins = splitByColon[1].split(" ");

    if(splitForMins[1].equals("pm"))
    {
      hoursValue = hoursValue + 12; 
    }
    else if (splitForMins[1].equals("am"){
      hoursValue = hoursValue + 12; 
    }

    int minutesValue = Integer.parseInt(splitForMins[0]); 

    String[] time = hoursValue + ":" + minutesValue

    System.out.println(time);
  }
}