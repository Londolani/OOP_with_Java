public class Passenger extends Person {
    String email;

    Passenger(String email, String name, String surname,String phone_number, int cash){
        super(name,surname,phone_number, cash); 
        //use of inheritance
        this.email = email;
    }

    //getters and setters

    public void setEmail(String newEmail){this.email  = newEmail;}

    public String getEmail() {return this.email;}

    //use of a toString method
    public String toString(){
        return super.toString() + " and I am a passenger";
    }   
}