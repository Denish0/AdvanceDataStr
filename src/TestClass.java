/*Name: Denish Oleke
 * CptS: 233 MicroAssignment#1
 * Date: 8/31/2020
 * GitRepo Url: https://github.com/Denish0/DataStructure.git
 * */


import java.util.Scanner;
public class TestClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will display for you"
				+ " the total carpet cost for "
				+ "\nthe room in detail\n");
		
		System.out.println("Enter the room lenth in feet\n");
		double length = input.nextDouble();
		
		System.out.println("Enter the room width in feet\n");
		double width = input.nextDouble();
		
		System.out.println("Enter Carpet Cost per square feet in "
				+ "dollars rounded to the dearest cent\n");
		double CarpetCost = input.nextDouble();
		
		RoomDimension dim = new RoomDimension(length, width);
		CarpetSize required = new CarpetSize(dim, CarpetCost);
		
		System.out.println(required);

	}
}
