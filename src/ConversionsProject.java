import java.util.Scanner;

/**
 * 
 * @author Tyler Muldoon
 * Conversions Project
 *
 */
public class ConversionsProject 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter what you would like to convert (feet to inches, miles to feet, \n yards to meters, or pounds to kilograms): ");
		String choice = user.nextLine();
		while ( !choice.equals("feet to inches") && !choice.equals("miles to feet") && !choice.equals("yards to meters") && !choice.equals("pounds to kilograms"))
		{
			System.out.println("That is an invalid answer please try again");
			System.out.print("Please enter what you would like to convert (feet to inches, miles to feet, \n yards to meters, or pounds to kilograms): ");
			choice = user.nextLine();
		}
		if (choice.equals("feet to inches"))
		{
			System.out.println("How many feet would you like to convert into inches: ");
			float feet = user.nextFloat();
			System.out.print(feetToInches(feet));
			
		}
		if (choice.equals("miles to feet"))
		{
			System.out.println("How many miles would you like to convert into feet: ");
			float miles = user.nextFloat();
			System.out.print(milesToFeet(miles));
			
		}
		if (choice.equals("yards to meters"))
		{
			System.out.println("How many yards would you like to convert into meters: ");
			float yards = user.nextFloat();
			System.out.print(yardsToMeters(yards));
			
		}
		if (choice.equals("pounds to kilograms"))
		{
			System.out.println("How many pounds would you like to convert into kilograms: ");
			float pounds = user.nextFloat();
			System.out.print(poundsToKilograms(pounds));
		}
	}
	
	public static float feetToInches(float feet)
	{
		float inches = feet * 12;
		return inches;
	}
	
	public static float milesToFeet(float miles)
	{
		float feet1 = miles * 5280;
		return feet1;
	}
	
	public static float yardsToMeters(float yards)
	{
		float meters = yards * 1.094f;
		return meters;
	}
	
	public static float poundsToKilograms(float pounds)
	{
		float kilograms = pounds * 2.205f;
		return kilograms;
	}
}
