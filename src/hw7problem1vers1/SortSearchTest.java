/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hw7problem1vers1;


import java.util.*;

/**http://users.dickinson.edu/~braught/courses/cs132s03/code/SortSearchTest.src.html
 * The SortSearchTest class contains two methods that are
 * useful for testing sorting and searching algorithms.
 */
public class SortSearchTest {

    private static Random rnd = new Random();

    /**
     * Generate and return an array with the specified
     * length containing random integers in the range
     * [0...max].
     *
     * @param length the length of the new array.
     * @param max the maximum integer value to be contained
     *            in the array.
     */
    public static int[] randomArray(int length, int max) {
	// Create the new array.
	int[] tmp = new int[length];

	// Fill the array with random integers in the
	// range [0...max]
	for (int i=0; i<tmp.length; i++) {
	    tmp[i] = rnd.nextInt(max+1);
	}

	return tmp;
    }

    /**
     * Print the elements of the specified array separated by
     * tabs, with lineLength elements per line.
     *
     * @param arr the array to be printed.
     * @param lineLength the number of elements to be printed
     *                   per line of output.
     */
    public static void printArray(int[] arr, int lineLength) {
	for (int i=0; i<arr.length; i++) {
	    if ((i+1) % lineLength == 0) {
		System.out.println(arr[i]);
	    }
	    else {
		System.out.print(arr[i] + "\t");
	    }
	}
    }
}