import java.util.Scanner;

 public class TemperatuereConversion{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Temperature in Celsius :");
	int temperatureinCelsius = sc.nextInt();
	
	int temperatureinFahrenheit = (temperatureinCelsius * 9/5) + 32;
	
	System.out.println("Temperature in Fahrenheit is : "  + temperatureinFahrenheit);
	
	sc.close();
	
	}
	}