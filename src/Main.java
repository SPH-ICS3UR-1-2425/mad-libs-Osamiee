import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Osamie
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a name");
		String name = in.nextLine();
		//flush
		in.nextLine();
		System.out.println("Give me an age");
		int age = in.nextInt();
		//flush
		in.nextLine();
		System.out.println("Give me a street name");
		String street = in.nextLine();
		System.out.println("Give me a single digit number");
		int time = in.nextInt();
		//flush
		in.nextLine();
		System.out.println("Give me a decimal number");
		double money = in.nextDouble();
		System.out.println("An old man named "+name+" and aged "+age+" was walking across "+street+" at "+time+" o'clock. He bought something from a grocery store and his total was $"+money+". ");
		

	}

}
