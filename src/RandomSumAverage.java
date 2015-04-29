import java.util.Random;
import java.util.ArrayList;

public class RandomSumAverage {

	public static void main(String[] args) {

		Random random = new Random();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		double sum = 0;
		double avg = 0;
		int k = 1;
		int element;
		while (sum < 1000000) {
			avg = sum / k;
			if (avg < 3) {
				element = random.nextInt(3)+4;
				sum += element;
				arr.add(element);
				k++;
			} else {
				element = random.nextInt(3)+1;
				sum += element;
				arr.add(element);
				k++;
			}
		}
		System.out.println(arr);
		System.out.println((int)sum);
		System.out.println((int)Math.round(avg));
	}
}
