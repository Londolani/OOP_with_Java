public class Person {
    //instance variables 
    private String name;
    private String surname;
    private String phone_number;
    private double cash;

    //use of a constructor
    Person(String name, String surname, String phone_number, double cash) {
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.cash = cash;
    }
    
    //setters
    public void setName(String newName){this.name = newName;}

    public void setSurname(String newSurname){this.surname = newSurname;}

    public void setPhoneNumber(String newPhone_number){this.phone_number = newPhone_number;}

    public void setCash(double newCash){this.cash = newCash;}

    //getters
    public String getName(){return this.name;}

    public String getSurname(){return this.surname;}
    
    public String getPhoneNumber(){return this.phone_number;}
    
    public double getCash(){return this.cash;}

    //toString method to avoid referencing memory
    public String toString() {
        return this.name + " " + this.surname;
    }
}