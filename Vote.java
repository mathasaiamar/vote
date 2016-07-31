import java.util.Scanner;

public class Vote {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int age ;
		System.out.print("enter your age:");
		age = s.nextInt();
		
		if(age >= 18)
		   System.out.println("You are eligible to vote");
		else
			System.out.println("You are not eligible to vote");
		
		
		
		

	}

}
