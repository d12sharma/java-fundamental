import java.util.Scanner;

class SimpleInterest {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal: ");
		int Principal = sc.nextInt();
		System.out.println("Enter the Rate: ");
		double Rate = sc.nextDouble();
		System.out.println("Enter the Time: ");
		int Time = sc.nextInt();
		
		double simpleInterest = (Principal * Rate * Time)/100;
		System.out.println("The Simple Interest is: " + simpleInterest);
		
	}
}