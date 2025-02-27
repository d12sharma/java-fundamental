import java.util.Scanner;

 public class KilometertoMiles{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Kilometers :");
	int Kilometers = sc.nextInt();
	
	double Miles = Kilometers * 0.621371;
	
	System.out.println("Miles :"  + Miles);
	
	
	
	}
	}