import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What would you like to say to the world?");
		
		String userInput = scanner.nextLine();
		
		if(userInput == "Hello!"){
			System.out.println("Hello world!");
		}
		
		else if(userInput == "Goodbye!"){
			System.out.println("Goodbye world!");
		}
		
		else if(userInput == "Nothing") {
			System.out.println("Wow! That's just mean...");
		}
	}
}
