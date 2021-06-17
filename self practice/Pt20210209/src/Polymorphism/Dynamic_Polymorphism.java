package Polymorphism;
import java.util.Scanner;
public class Dynamic_Polymorphism {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What animal do you wang?");
		System.out.print("(1=dog) or (2=cat): ");
		int choice = in.nextInt();
		
		switch(choice) {
		case 1:
			animal = new Dog();
			animal.speak();
			break;
		case 2:
			animal = new Cat();
			animal.speak();
			break;
		default:
			animal = new Animal();
			System.out.println("That choice was invalid");
			animal.speak();
			break;
		}
		
		in.close();
	}

}
