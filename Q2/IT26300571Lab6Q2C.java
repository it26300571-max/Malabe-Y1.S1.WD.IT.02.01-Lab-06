import java.util.Scanner;
public class IT26300571Lab6Q2C {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;
		
		System.out.println( " Enter number 1 : ");
		num1 = input.nextInt();
		
		System.out.println( " Enter number 2 : ");
		num2 = input.nextInt();

		System.out.println( " Enter number 3 : ");
		num3 = input.nextInt();
	
        System.out.println( " Enter number 4 : ");
		num4 = input.nextInt();

        System.out.println( " Enter number 5 : ");
		num5 = input.nextInt();
		
		System.out.println( " Enter number 6 : ");
		num6 = input.nextInt();
		
		System.out.println( " Enter number 7 : ");
		num7 = input.nextInt();
		
		System.out.println( " Enter number 8 : ");
		num8 = input.nextInt();
		
		System.out.println( " Enter number 9 : ");
		num9 = input.nextInt();
		
		System.out.println( " Enter number 10 : ");
		num10 = input.nextInt();
		
		System.out.print( " The numbers you entered are : ");
		
		System.out.println( num1+ " " + num2 + " " + num3 + " " + num4 + " " + num5+ " " + num6 + " " + num7 + " " + num8+ " " + num9+  " " + num10);
		
		int sum= (num1+ num2+ num3+ num4+ num5+ num6+ num7+num8+ num9+ num10);
		double avg = sum/10.0;
		
		System.out.println(" Sum of the numbers :" + sum);
		
		System.out.println("Average of the numbers:" + avg);
		
	}
}

