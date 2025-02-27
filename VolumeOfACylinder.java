import java.util.Scanner;

class VolumeOfACylinder{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Height: ");
	int Height = sc.nextInt();
	 System.out.println("Enter Radius: ");
	int Radius = sc.nextInt();
	
	double Volume = Math.PI * (Radius*Radius) * Height;
	System.out.println("Volume of the Cylinder is :" + Volume);
	
	sc.close();
	
	}
	}
	
	