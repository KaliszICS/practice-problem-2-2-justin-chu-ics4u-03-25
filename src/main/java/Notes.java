import java.util.Arrays;

class Notes {
	public static void main(String[] args) {
		//Binary Search

		//array we are going to search through
		int numArray[] = {1, 5, 6, 7, 2, 3, 4, 6, 8, 9, 2, 234, 2, 234, 234};

		int num = 234; // number we're looking for
		int index = -1;

		Arrays.sort(numArray);

		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println();

		int low = 0;
		int high = numArray.length - 1;
		int mid;

		while(low <= high) {

			mid = (high + low) / 2;

			if (num == numArray[mid]) {
				index = mid;	
				low = high + 1; //set the while condition to false
			}
			else if (num > numArray[mid]) {
				low = mid + 1;
			}
			else { //num < numArray[mid]
				high = mid - 1;
			}
		}

		System.out.println(index); //Does not guarentee the first/last or any other occurance of an element.  Just gives the first one it finds.






		
		// //Index values of low, high and mid
		// int low = 0; //first index of the array
		// int high = numArray.length - 1; //last element of the array index
		// int mid = (low + high) / 2;

		// //Sorts the array
		// Arrays.sort(numArray);

		// for (int i = 0; i < numArray.length; i++) {
		// 	System.out.print(numArray[i] + " ");
		// }
		// System.out.println();
		// //Start binary searching
		// while (high >= low) { //continues searching until we run out of elements to search

		// 	//Have we found the number
		// 	if (numArray[mid] == num) {
		// 		index = mid;
		// 		//make the condition for the while loop false
		// 		low = high + 1;
		// 	}

		// 	//less than
		// 	else if (numArray[mid] < num){
		// 		low = mid + 1;
		// 		// mid = (low + high) / 2;
		// 	}
			
		// 	//greater than
		// 	// else if (numArray[mid] > num){
				
		// 	// }
		// 	else {
		// 		high = mid - 1;
		// 		// mid = (low + high) / 2;
		// 	}

		// 	//Can be written outside if statements to get rid of repeated code.
		// 	mid = (low + high) / 2;
		// }

		// System.out.println(index);
	}
}
