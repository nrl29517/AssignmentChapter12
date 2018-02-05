import java.util.*;

public class ClassExercise12_3 {
	
	
	
	private static double sum() throws InputMismatchException	
	{
		Double sum = 0.0;
		Double num = -1.0;
		boolean stop = false;
		Scanner input = new Scanner(System.in);
		while(num != 0)
		{
				System.out.println("Please enter a number. Enter zero to stop.");
				num = input.nextDouble();
				
				sum += num;
		}
		
		return sum;
	}
	
	public static void main(String[] args) 
	{
		double num = 0;
		boolean go = false;
		while( go != true)
		{
			try
			{
			 	num += sum();
			 	System.out.println("The sum is " + num);
			 	go = true;
			} catch(InputMismatchException e)
			{
				System.out.println("Please enter a number.");
				go = false;
			}
		
		}
		

	}

}
