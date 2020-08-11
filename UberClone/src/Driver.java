public class Driver extends Person {
    Car car; //use varible of a class type
    String licenseID;
    
    Driver(Car car, String licenseID, String name, String surname,String phone_number, int cash){
        super(name,surname,phone_number,cash);
        //inheritance   
        this.car = car;
        this.licenseID = licenseID;    
    }

    //getters and setters
    public void setCar(Car newCar){this.car = newCar;}

    public void setlicenseID(String newLicenseID){this.licenseID = newLicenseID;}

    public Car getCar(){return this.car;}

    public String getlicenseID(){return  this.licenseID;}
    //to string function i know how to use to prevent return of memory reference
    public String toString(){return super.toString() + " and I am a driver";}
}