public class UberService{
   String name;
   int costPerMin;
   int costPerKM;
   int baseFee;
   int cancellationFee;
  // int costPerJourney = baseFee + costPerMin + costPerKM ;
   
   void setDetails(String name, int costPerMin,int costPerKM, int baseFee, int cancellationFee){
      this.name = name ;
      this.costPerMin = costPerMin;
      this.costPerKM = costPerKM;
      this.baseFee = baseFee;
      this.cancellationFee = cancellationFee;  
   }
   
   void setName(String name){
      this.name = name; 
   }
   
   String getName(){
      return this.name;
   }
   
   void setCostPerMinute(int cents){
      this.costPerMin = cents;
   }
   
   int getCostPerMinute(){
      return this.costPerMin;   
   }
   
   void setCostPerKilometre(int cents){
      this.costPerKM = cents;
   }
   
   int getCostPerKilometre(){
      return this.costPerKM;
   }
   
   void setBaseFare(int cents){
      this.baseFee = cents;
   }
   
   int getBaseFare(){
      return this.baseFee;
   }
   
   void setCancellationFee(int n){
      this.cancellationFee = n;
   }
   
   int getCancellationFee(){
      return this.cancellationFee;   
   }   
   
   double calculateFare(double minutes, double distance){
      return baseFee + (costPerMin*minutes) + (costPerKM*distance) ;
      //return minutes*distance;
   }
}