

public class Student{
   private String firstName;
   private String middleName;
   private String lastName;
   
   public void setNames(String first, String middle, String last){
      this.middleName = middle;
      this.firstName = first;
      //middle this.middleName;
      this.lastName = last;;
   }
   
   public String getFullName(){
      //char initial =  middleName.charAt(0);
     // System.out.println(initial);
      //String finals = firstName +" " + initial +"."+ " " + lastName;
      //return finals;
      //String finake = middleName.charAt(1);
      return  this.firstName +" " + this.middleName.substring(0,1)+"."+ " " + this.lastName;

   }
   
   
}