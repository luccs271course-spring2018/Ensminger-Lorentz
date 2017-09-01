package hw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
    {
		Scanner reading = new Scanner(System.in);
		int max = 0;

		System.out.print("Enter Max Number: ");
		max = reading.nextInt();

		for(int i = 1; i <= max ; i++)
		{
			if((i % 3 == 0 && i%5 == 0) && i != 0)
			{
				System.out.println("Fizz Buzz");
			}
			else if((i % 3 == 0) && i != 0)
			{
				System.out.println("Fizz");
			}
			else if((i % 5 == 0) && i != 0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}

	}
}
