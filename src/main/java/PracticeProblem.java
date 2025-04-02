import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static int[] compareSearch(int[] array, int number) {
		int sequentialLoops = 0;
		int binaryLoops = 0;
		boolean foundSequential = false;

		//seq
		for (int i = 0; i < array.length; i++) {
			sequentialLoops++;

			if (array[i] == number) {
				foundSequential = true;
				break;
			}
		}

		//bin
		int low = 0;
		int high = array.length - 1;

		while (low <= high) {
			binaryLoops++;

			int mid = low + (high - low) / 2;

			if (array[mid] < number) {
				low = mid + 1;
			}

			else if (array[mid] > number) {
				high = mid - 1;
			}

			else {
				break;
			}
		}

		return new int[] {sequentialLoops, binaryLoops};
	}

	public static int[] compareStringSearch(String[] array, String word) {
		int sequentialLoops = 0;
		int binaryLoops = 0;
		int[] results = new int[2];

		//seq
		boolean foundSequential = false;
		for (int i = 0; i < array.length; i++) {
			sequentialLoops++;
			if (array[i].equals(word)) {
				foundSequential = true;
				break;
			}
		}
		results[0] = sequentialLoops;


		Arrays.sort(array);

		int low = 0;
		int high = array.length - 1;
		boolean foundBinary = false;

		while (low <= high) {
			binaryLoops++;
			int mid = low + (high - low) / 2;
			int comparison = array[mid].compareTo(word);

			if (comparison == 0) {
				foundBinary = true;
				break;
			}

			else if (comparison < 0) {
				low = mid + 1;
			}

			else {
				high = mid - 1;
			}
		}
		results[1] = binaryLoops;

		return results;
	}
	
}

//test
