import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter positive integer only: ");
		int number = input.nextInt();
		if(number % 1 > 0 && number % number > 0 ){
			System.out.print(number + "Not a prime");
		}
	}
}