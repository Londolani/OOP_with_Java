

public class Profile{
    private Person person;
    private Image[] images; 

   Profile(Person person,Image[] images){
      this.person = person;
      this.images = images;
   }
   
   public Person getPerson(){return this.person;}
   public Image[] getImage(){return this.images;}
   
   public void setPerson(Person newPerson){this.person = newPerson;}
   public void setImage(Image[] newImage){this.images = newImage;}
   
   public String toString(){
      Person p = this.person;
     return "Name: "+ p.getName()+
            "\nAge: " + p.getAge()+
            "\nBio: " + p.getBio()+
            "\nGender: "+ p.getGender()+
            "\nImages: "+
            "\nImage 1: "+this.getImage()[0].getUrl()+
            "\nImage 2: "+this.getImage()[1].getUrl()+
            "\nImage 3: "+this.getImage()[2].getUrl();
   
   }

} 