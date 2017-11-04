import java.util.Scanner;

public class UseMethodsWithParameters {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		TunaMethParameters TunaMethParametersObject = new TunaMethParameters ();
		
		System.out.println("Enter your name here:");
		String name = input.nextLine();
		
		TunaMethParametersObject.simpleMessage (name);

	}

}
