import java.util.*;
public class BookExercise12_3 {

	public static void main(String[] args) 
	{
		boolean works = false;
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] =(int)(Math.random()* 1000);
		}
		Scanner input = new Scanner(System.in);
		while(works == false)
		{
			try
			{
				System.out.println("Please enter an index for an array of length: " + arr.length);
				int index = input.nextInt();
				if (index < 0 || index >=100)
				{
					System.out.println("Index is OUT OF BOUNDS");
					System.out.println("Index: " + index + " Array Length: " + arr.length + ". Please enter a new index;");
					works = false;
				}else
				{
				System.out.println("The number at index " + index + " is " + arr[index] +".");
				works = true;
				}
			} catch(InputMismatchException e)
			{
				input.nextLine();
				System.out.println(e);
				System.out.println("Invalid input, enter a number");
				works = false;
			}
		}
	}

}
