import java.util.Scanner;

public class AreaOfCircle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius :");
		int radius = sc.nextInt();
		double Area = Math.PI * (radius*radius);
			System.out.println("The Area of circle is :" + Area);
			
			sc.close();
			
			}
			}
		