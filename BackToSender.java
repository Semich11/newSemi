import java.util.Scanner;

public class BackToSender{
	public static void main(String[] args){
		System.out.println("The rider wage for the day is: " + BackToSenderFunction() + ".");
	}

	public static int BackToSenderFunction(){
		
		Scanner input = new Scanner(System.in);

		int amountPerParcel = 0;

		System.out.println("How many times the rider made a successful delivery?:");
		int userInput = input.nextInt();

		if(userInput >= 70) amountPerParcel = 500;

		else if(userInput >= 60 && userInput <= 69) amountPerParcel = 250;

		else if(userInput >= 50 && userInput <= 59) amountPerParcel = 200;

		else amountPerParcel = 160;




		int riderDailyPay = userInput * amountPerParcel + 5000;


		return riderDailyPay;
	}
}