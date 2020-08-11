import java.util.Scanner;

public class PalinPerfect{
	public static void main(String [] args){

		int factors = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the start point N: ");
		int min = keyboard.nextInt();
		System.out.println("Enter the end point M: ");
		int max = keyboard.nextInt();
		int rev = 0;

      int j = 0;
		System.out.println("The palindromic perfect squares are as follows:");
      for (j = min; j <= max; j++){
         for(int i=0; i>0;i/=10){
            rev = rev * 10 + i % 10;
            System.out.println(rev);
            if(j == rev){
               System.out.println(j);
            }
                  //return (n==rev)
         }
      }              
      
		/**for(int i = min+1;i<max;i++){

			String toreverse = Integer.toString(i);

			for(int z = toreverse.length() - 1; z >= 0; z--)
 			{
 				reverse = reverse + toreverse.charAt(i);
 			}

			if(reverse == toreverse){
				for(int j=1;j<i+1;j++){
					if (i%j ==0){
						factors = factors + 1;
					}	
				if(factors == 2){
					System.out.println(i);
				}	
				factors = 0	;
				}
			}
		}*/

	}
}

