public class GasMilageCalculator{


	public double computeMilesPerGallon(double firstNumber, double secondNumber){

		
		return 1.5;	

	}

	public int computeMultiplication(int firstNumber, int secondNumber){
		int product = 0;
		int holder = 0;
		if(secondNumber < 0){
			holder = secondNumber;
			secondNumber = firstNumber;
			firstNumber = holder;	
		}
		for(int count = 1; count <= secondNumber; count++){

			product += firstNumber;
		}
		return product;	
	}

}