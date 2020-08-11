import java.util.*;

public class UberApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Uber App");

        //ability to call created class objects
        Passenger londolani = new Passenger("londolani0700@gmail.com", "Londolani", "Ndou","0766057755", 20000);        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your current starting location");
        
        //be able to use the scanne rto read input from the user 
        String startPoint = keyboard.nextLine();

        System.out.println("Please enter your final destination location");
        String endPoint = keyboard.nextLine();

        System.out.println("Please vehicle of your choice, either XL or X");
        String vehicleType = keyboard.nextLine();
        
        System.out.print("Starting Point: ");
        System.out.print(startPoint);
        System.out.print("\nEnd Point: ");
        System.out.print(endPoint);
        System.out.print("\nVehicle Type: ");
        System.out.print(vehicleType);
        System.out.println("");

        UberRide uberRide = new UberRide(startPoint, endPoint, lonwabo);

        Driver assignedDriver = uberRide.assignDriver();

        System.out.println("\nCalculating cost...");
        uberRide.calculateCost(startPoint, endPoint);
        
        System.out.println("\nFinding you a driver...");
        System.out.println("Assigned driver: " + assignedDriver.getName() + " " + assignedDriver.getSurname());
        System.out.println("Assigned car: " + assignedDriver.getCar());
        
        System.out.println("\nYour ride is complete. Processing payment...");
        uberRide.completePayment(assignedDriver, londolani);
    }
}