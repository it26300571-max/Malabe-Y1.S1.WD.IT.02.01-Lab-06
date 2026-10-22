import java.util.Scanner;
public class  IT26300571Lab6Q3 {
	public static void main (String[]args){
	Scanner input = new Scanner (System.in);
	int sqrSum = 0;
	int numOfNumbers =0;
	
	
	System.out.println( "Enter positive integers (Terminate input with -99)");
	int num = input.nextInt();
	
	while ( num != -99){
	
	if ( num > 0){
		numOfNumbers++;
		sqrSum = (sqrSum + num*num);
	}
	else {
	System.out.println("Error : input a positive number ");
	}
	num = input.nextInt(); 
	}
	
	if (numOfNumbers!= 0 ) {
		double  rms = Math.sqrt (sqrSum/numOfNumbers);
		System.out.println("The Root Mean Square (RMS):" + rms);
	}
	
	}
}