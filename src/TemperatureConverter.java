import java.util.Scanner;
public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conv(0,0);
		num(0);
	}
	public static void Conv(double C, int F) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a conversion value in Celcious"
				+ " followed by a Farenheits");
		
		C = input.nextInt();
		F = input.nextInt();
		double Celc = ((9*C)/5)+32;
		System.out.println(C + " Degree Celcious = "+Celc+" Drgree Farenheits");
		
		double Far = (F-32)*5/9;	
		System.out.println(F + ".0 Degree Farenheits = "+ Far+" Drgree Celcious");
			
	}
	
	public static void num(int Num) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter an integer");
		Num = input.nextInt();
		String output = String.valueOf(Num);
		
		for (int i = 0; i < output.length(); i++) {
			int j = Character.digit(output.charAt(i), 10);
			System.out.println("Outputs at index ("+ i +") = "+j);
		}
	}
}
