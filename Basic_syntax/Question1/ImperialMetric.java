import java.util.Scanner;

public class ImperialMetric{
	public static void main(String [] args){

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the minimum number of feet (not less than 0): ");
		int min = keyboard.nextInt();
		System.out.println("Enter the maximum number of feet (not more than 30): ");
		int max = keyboard.nextInt();

		System.out.println();
		System.out.println("      |");
      
      int z=0,i=0,j=0;
      
		if(min >= 0 && max <= 30){
			for(z=0;z<12;z++){
				//String q =Integer.toString(z)
				System.out.format(":3.%f%n", Integer.toString(z));
			}
			for(i = min; i<max+1;i++){
				System.out.format("4.%f%n", Integer.toString(z));
				for(j = 0;i<12;j++){
					double x = (i*0.3048)+(j*0.0254);
					System.out.format(":.%f%n", Integer.toString(z));
					System.out.println() ;
				}
			}//System.out.format("%10.3f%n", pi);   // -->  "     3.142"
		}

	}
}

