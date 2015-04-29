import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter lower limit");
		int lowerLimit = input.nextInt();

		System.out.println("Enter upper limit");
		int upperLimit = input.nextInt();

		input.close();

		for (int i = lowerLimit; i <= upperLimit; i++) {
			if (findPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean findPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0) {
				return false;
			}
		return true;
	}
	int i = 0;
	boolean ifArgument(int a) {
		for (int j = 0; j < a; j++){
			if (i+j % 25 == 0) {
				return true;
			}
		}return false;
	}
	
}