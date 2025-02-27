import java.util.Scanner;
class AverageOfThreeNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  First Number: ");
		int firstNumber=sc.nextInt();
		System.out.println("Enter Second Number: ");
		int secondNumber=sc.nextInt();
		System.out.print("Enter Third Number: ");
		int thirdNumber=sc.nextInt();
		int  Average = (firstNumber + secondNumber + thirdNumber)/3;
		
		System.out.println("Average of these three Number is: " + Average);
		
		
		
	}
}