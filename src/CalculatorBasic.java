import java.util.Scanner;

public class CalculatorBasic {

	public static void main(String[] args) {
		Scanner tomias = new Scanner (System.in);
		double fNum, sNum, answer;
		System.out.println("Enter First Number: ");
		fNum = tomias.nextDouble();
		System.out.println("Enter Second Number: ");
		sNum = tomias.nextDouble();
		answer = fNum + sNum;
		System.out.println(answer);

	}

}
