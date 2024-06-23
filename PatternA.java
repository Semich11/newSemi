public class PatternA{
	public static void main(String[] args){

		for (int pattern = 1; pattern <=6; pattern++){

			for (int counter = 1; counter <= pattern; counter++){
		    	System.out.printf("%d ", counter);
			}			

			System.out.println();
		}
	}
}