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
		System.out.println("Give me a store name");
		String store = in.nextLine();
		//flush
		in.nextLine();
		System.out.println("Give me a decimal number");
		double money = in.nextDouble();
		//flush 
		in.nextLine();
		System.out.println("Give me a name");
		String name1 = in.nextLine();
		//flush
		in.nextLine();
		System.out.println("Give me an age");
		int age1 = in.nextInt();
		//flush
		in.nextLine();
		System.out.println("Give me a company name");
		String company = in.nextLine();
		//flush
		in.nextLine();
		System.out.println("Give me a number");
		int money1 = in.nextInt();
		System.out.println("An old man named "+name+" and aged "+age+" was walking across "+street+" at "+time+" o'clock.)"
				+ "( He bought something from " + store + " and his total was $"+money+".)"
						+ "( He left the store and seen his old friend "+name1+".)"
								+ "( His friend was now " +age1+ " and was the owner of "+company+".)"
										+ "( "+ name1+" gave "+ name +" $"+ money1 +" as a gift.");

	}

}
