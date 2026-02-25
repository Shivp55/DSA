package ArraysDS;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		Integer [] array = {3,1,2};
	//Ascending order
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		int index = Arrays.binarySearch(array, 3);
		System.out.println(index);

	//Descending order
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));

		int index1 = Arrays.binarySearch(array, 3, Collections.reverseOrder());
		System.out.println(index1);
	}

}
