import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What would you like to say to the world?");
		
		String userInput = scanner.nextLine();
		
		if(userInput == "Hello"){
			System.out.println("Hello world!");
		}
		
	}
}
