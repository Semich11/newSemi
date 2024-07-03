import java.util.Scanner;

public class Kata{

	public static boolean evenMethod(int number){
		Scanner input = new Scanner(System.in);

		System.out.println("Check is a number is even:");
		int number = input.nextInt();

		if(number % 2 == 0) return true;
		return false;
	}

	public static boolean primeMethod(){
		Scanner input = new Scanner(System.in);
		int sum = 0;

		System.out.println("Check if a number is a prime: ");
		int number = input.nextInt();

		for(int counter = 1; counter < number; counter++){
			if(counter == 1) continue;
			if(number % counter == 0){
				sum++;	
				break;	
			}
			//System.out.println(counter);

		}

		if(sum > 0) return false;
		return true;
	}

	public static int subtractMethod(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();

		System.out.println("Enter first number: ");
		int secondNumber = input.nextInt();



		int sum = firstNumber - secondNumber;

		if(sum < 0) sum = secondNumber - firstNumber;

		return sum;

	}



	public static float divideMethod(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int firstNumber = input.nextInt();

		System.out.println("Enter second number: ");
		int secondNumber = input.nextInt();

		if(secondNumber == 0) return 0;

		float quotient = (float) firstNumber / secondNumber;

		//float result = System.out.printf("%.2f",quotient);


		if(secondNumber == 0){
        		String formattedQuotient = String.format("%.0f", secondNumber);
        		return Float.parseFloat(formattedQuotient);		
		}


        	String formattedQuotient = String.format("%.2f", quotient);
        	return Float.parseFloat(formattedQuotient);
	}



	public static int factorOfNumberMethod(){
		Scanner input = new Scanner(System.in);
		int sum = 1;

		System.out.println("Check how many factor a number have: ");
		int number = input.nextInt();

		for(int counter = 1; counter <= number/2; counter++){
			if(number % counter == 0){
				sum++;	
			}
		}

		if(sum > 0) return sum;

		return 0;
	}



	public static boolean isSqaureMethod(){
		Scanner input = new Scanner(System.in);

		System.out.println("Check if a number is a square: ");
		int number = input.nextInt();

		double root = Math.sqrt(number);

		if(root * root == number){ 
			return true;
		}
		return false;
	}


	public static boolean PalindromeMethod(){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a five digit integer: ");
		int num = input.nextInt();
		int numHolder = num;

		int revNum = 0;

		while(num > 0){
			revNum = revNum * 10 + num % 10;
			num = num / 10;
		}

		if(revNum == numHolder) return true;
		return false;

		//System.out.print(revNum);


	}



	public static long FactorialMethod(){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a integer: ");
		int num = input.nextInt();
		int numHolder = num;

		long product = 1;

		for(int number = num; number >= 1; number--){
			product *= number;

		}

		return product;

	}

}