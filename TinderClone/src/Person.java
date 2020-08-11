

public class Person{
  /**I can create create instance variables and able to use another class type variable in another class
  use getters to get access to variables of a class
  */
   private String name;
   private int age;
   private String gender;
   private String location;
   private String bio;
   
  //I am able to craete constructors and understand what a consrutor does
  Person(String name, int age, String gender, String location, String bio){
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.bio = bio;
      this.location =  location;
  }
   
     // I know how to craete getters and setters
  public String getName() {
    return this.name;
  }
  public String getGender(){return this.gender;}
  public int getAge(){return this.age;}
  public String getLocation(){return this.location;}
  public String getBio(){return this.bio;}

  // Setters

  public void setName(String newName) {
    this.name = newName;}
  public void setAge(int newAge){this.age = newAge;}
  public void setLocation(String newLocation){this.location = newLocation;}
  public void setBio(String newBio){this.bio = newBio;}
  public void setGender(String newGender){this.gender = newGender;}
}

//@Overide
public String toString(){
  
    return "name " + this.name + " location " + this.location;
}