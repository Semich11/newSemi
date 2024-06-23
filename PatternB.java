public class PatternB{
	public static void main(String[] args){	
		for (int pattern = 6; pattern >=1; pattern--){
			for(int counter = 6; counter >= pattern; counter--){
			System.out.printf("%d ", counter);
		}
		System.out.println();}
	}
}