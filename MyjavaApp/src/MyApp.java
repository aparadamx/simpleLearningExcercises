import java.util.Scanner;

public class MyApp {
	
	public static void main(String[] args) {
		int[] cashBacks = {20,200,320,500,50,80,90,1000};
		int luckyNumber = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Lucky Number: ");
		
		try {
			luckyNumber = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("sorry!  Input MisMatched");
		}
		System.out.println("For Your Lucky Number " + luckyNumber + " CashBack Earned is: " + cashBacks[luckyNumber]);
	}
}
