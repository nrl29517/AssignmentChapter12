import java.util.*;

public class ClassExercise12_2 {

	public static void main(String[] args) {
		Double sum = 0.0;
		Double num = -1.0;
		boolean stop = false;
		Scanner input = new Scanner(System.in);
		while(num != 0)
		{
			try
			{
				System.out.println("Please enter a number. Enter zero to stop.");
				num = input.nextDouble();
				sum += num;
			} 
			catch (InputMismatchException e)
  	  		{
			 input.nextLine();
			 System.out.println(e);
			 System.out.println("Invalid input, enter a number");
  		  
  	  		}
		}
		System.out.println("The sum is :" + sum);
		
	}
}
