import java.util.Scanner;

public class RandomNumAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an Object of the reference Class.
		ReferenceClass refClass = new ReferenceClass();
		
		//Get the number from the console
		System.out.println("Enter the number for which the random number is to be cauculated");
		Scanner sc = new Scanner(System.in);
		refClass.setNum(sc.nextInt());
		sc.close();
		
		//Random Number Generator
		System.out.println("The Random number generated is "+refClass.randNum(refClass.getNum()));

	}

}
