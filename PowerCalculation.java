import java.util.Scanner;

class PowerCalculation{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Base: ");
	int Base = sc.nextInt();
	System.out.println("Enter the Exponential: ");
	int Exponential = sc.nextInt();
	
	double Power = Math.pow(Base,Exponential);
	
	System.out.println(" The Answer is : "+ Power);
	}
}