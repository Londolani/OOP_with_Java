public abstract class Ride {

    String estartingPoint;
    String endingPoint;

    /*methods that can be overriden
      for different rides companies 
      can be used and just be added to whatever extra features we may have 
    */
    public abstract double calculateDistance(String startingPoint, String endingPoint);
    public abstract Driver assignDriver();
    public abstract double calculateCost(String startingPoint, String endingPoint);
    public abstract void completePayment(Driver driver, Passenger passenger);

 }