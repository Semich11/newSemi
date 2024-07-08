import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);



		int studentNumber = 4;
		int subjectNumber = 3;

		int subjectScore = 0;		

		int[] student1;
		student1 = new int[subjectNumber];

		int[] student2;
		student2 = new int[subjectNumber];

		int[] student3;
		student3 = new int[subjectNumber];

		int[] student4;
		student4 = new int[subjectNumber];


		for(int studentCounter = 1; studentCounter <= studentNumber; studentCounter++){
			for(int subjectCounter = 1; subjectCounter <= subjectNumber; subjectCounter++){

				System.out.println("Entering score for student " + studentCounter);
				System.out.println("Enter score for subject " + subjectCounter);

				if(studentCounter == 1 ) student1[subjectCounter - 1 ] = input.nextInt();
				else if(studentCounter == 2 ) student2[subjectCounter - 1 ] = input.nextInt();
				else if(studentCounter == 3 ) student3[subjectCounter - 1 ] = input.nextInt();
				else student4[subjectCounter - 1 ] = input.nextInt();

			}
		}

		int sum1 = 0;
		double average1 = 0;

		for(int count = 0; count <= student1.length - 1; count++){
			sum1 += student1[count];
		}

		average1 = (double) sum1 / subjectNumber;

		System.out.printf("%.2f%n", average1);



		int sum2 = 0;
		double average2 = 0;

		for(int count = 0; count <= student2.length - 1; count++){
			sum2 += student2[count];
		}

		average2 = (double) sum2 / subjectNumber;

		System.out.printf("%.2f%n", average2);



		int sum3 = 0;
		double average3 = 0;

		for(int count = 0; count <= student3.length - 1; count++){
			sum3 += student3[count];
		}

		average3 = (double) sum3 / subjectNumber;

		System.out.printf("%.2f%n", average3);





		int sum4 = 0;
		double average4 = 0;

		for(int count = 0; count <= student4.length - 1; count++){
			sum4 += student4[count];
		}

		average4 = (double) sum4 / subjectNumber;

		System.out.printf("%.2f%n", average4);


 		double firstPosition = 0;
 		double secondPosition = 0;
 		double thirdPosition = 0;
 		double fourthPosition = 0;

 		double highest = 0;




		double[] allCombineAverage = new double[] {average1, average2, average3, average4};



 		for(double element : allCombineAverage){
			if(element > highest) highest += element;
 		}

		System.out.println(highest);






		System.out.println(Arrays.toString(student1));

		System.out.println(Arrays.toString(student2));

		System.out.println(Arrays.toString(student3));


	}
}

