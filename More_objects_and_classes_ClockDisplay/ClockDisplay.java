

public class ClockDisplay{
   
   private int hours;//CounterDisplay hours;
   private int minutes;//CounterDisplay minutes;
   
   public ClockDisplay(int pHours, int pMinutes){
      
      //this.hours = pHours;
      //this.minutes =  pMinutes;
     ClockDisplay clockDisplay = new ClockDisplay(pHours,pMinutes);
   }
   
   public void setTime(int pHours, int pMinutes){
      this.hours = pHours;;
      this.minutes = pMinutes ; 
   }
   
   public void tick(){
      this.minutes +=1; //Integer.parseInt(minutes) + 1;
   }
   
   public String getDisplayValue(){
      return this.hours + ":" + this.minutes;
   }
}