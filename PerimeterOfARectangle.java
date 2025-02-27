import java.util.Scanner;

class PerimeterOfARectangle{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int Length = sc.nextInt();
		System.out.println("Enter the Breadth: ");
		int Breadth = sc.nextInt();
		int perimeter = 2 * (Length + Breadth);
		System.out.println("Enter the Perimeter Of A Rectangle: "+ perimeter );
		}
}