

public class CounterDisplay{
   private int value;
   private int limit; 
   
   public CounterDisplay(int pLimit){
         this.value = 0;
         this.limit = pLimit;
         //CounterDisaplay counterDisplay = new counterDisplay(pLimit);
   }
   
   public void setValue(int pValue){
      this.value = pValue;
   }
   
   public int getValue(){
      return this.value;
   }
   
   public void increment(){
      if(this.value<60){
         this.value+=1 ;
      }
      else if(this.value >= 60){
         this.value = 0;
      }
   }
   
   public String getDisplayValue(){
      
      return ""+ this.value +"";
   }
}