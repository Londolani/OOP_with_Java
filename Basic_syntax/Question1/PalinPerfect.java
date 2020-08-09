import java.uti.Scanner;

public class PalinPerfect{
	public static void main(String [] args){

		int factors = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the start point N: ");
		int min = keyboard.nextInt();
		System.out.println("Enter the end point N: ");
		int max = keyboard.nextInt();
		String reverse = "";


		System.out.println("The palindromic primes are:");
		for(int i = min+1;i<num2;i++){

			String toreverse = Integer.toString(i) 

			for(int i = toreverse.length() - 1; i >= 0; i--)
 			{
 				reverse = reverse + toreverse.charAt(i);
 			}

			if(reverse == toreverse){
				for(int j=1,j<i+1;j++){
					if (i%j ==0){
						factors = factors + 1;
					}	
				if(factors == 2){
					System.out.println(i)
				}	
				factors = 0	
				}
			}
		}

	}
}

