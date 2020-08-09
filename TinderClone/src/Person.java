

public class Person{
   private String name;
   private int age;
   private String gender;
   private String location;
   private String bio;
   
  Person(String name, int age, String gender, String location, String bio){
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.bio = bio;
      this.location =  location;
  }
   
     // Getter
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