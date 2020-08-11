import java.util.Scanner;

public class TimeConvertor {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a time ([h]h:mm [am|pm]):");
    String timeValue = keyboard.nextLine();
    String[] splitByColon = timeValue.split(":");
    int hoursValue = Integer.parseInt(splitByColon[0]);
   
    String[] splitForMins = splitByColon[1].split(" ");
    String minutesValue = splitForMins[0];
    String time = hoursValue + ":" + minutesValue; ;

    if(hoursValue == 0){
      hoursValue = hoursValue + 12; 
      time = hoursValue + ":" + minutesValue + " am";
    }else if(hoursValue >12){
      hoursValue = hoursValue - 12; 
      time = hoursValue + ":" + minutesValue + " pm";
    }else if(hoursValue < 12 && hoursValue >1){
      hoursValue = hoursValue ; 
      time = hoursValue + ":" + minutesValue + " am";
     }else if(splitForMins[1].equals("pm")&& hoursValue !=12)
    {
      hoursValue = hoursValue + 12;
      time = hoursValue + ":" + minutesValue;
    }
    else if (splitForMins[1].equals("am") && hoursValue !=12){
      hoursValue = hoursValue + 0; 
      time = "0"+ hoursValue + ":" + minutesValue;
    }else if (splitForMins[1].equals("pm")&&hoursValue == 12){
      hoursValue = hoursValue ; 
      time =  hoursValue + ":" + minutesValue;
    }else if (splitForMins[1].equals("am")&&hoursValue == 12){
      hoursValue = hoursValue - 12; 
      time = "0"+ hoursValue + ":" + minutesValue;
    }

 //   String minutesValue = splitForMins[0]; //Integer.parseInt(splitForMins[0]); 

  //  String time = hoursValue + ":" + minutesValue;

    System.out.println(time);
  }
}