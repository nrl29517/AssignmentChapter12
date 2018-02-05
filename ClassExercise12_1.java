import java.util.*;

public class ClassExercise12_1 {

	public static void main(String[] args) {
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
		System.out.println("The sum is :" + sum);
		
	}
}
